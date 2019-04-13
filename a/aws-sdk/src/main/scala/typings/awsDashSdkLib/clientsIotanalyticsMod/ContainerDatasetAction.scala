package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDatasetAction extends js.Object {
  /**
    * The ARN of the role which gives permission to the system to access needed resources in order to run the "containerAction". This includes, at minimum, permission to retrieve the data set contents which are the input to the containerized application.
    */
  var executionRoleArn: RoleArn
  /**
    * The ARN of the Docker container stored in your account. The Docker container contains an application and needed support libraries and is used to generate data set contents.
    */
  var image: Image
  /**
    * Configuration of the resource which executes the "containerAction".
    */
  var resourceConfiguration: ResourceConfiguration
  /**
    * The values of variables used within the context of the execution of the containerized application (basically, parameters passed to the application). Each variable must have a name and a value given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".
    */
  var variables: js.UndefOr[Variables] = js.undefined
}

object ContainerDatasetAction {
  @scala.inline
  def apply(
    executionRoleArn: RoleArn,
    image: Image,
    resourceConfiguration: ResourceConfiguration,
    variables: Variables = null
  ): ContainerDatasetAction = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn, image = image, resourceConfiguration = resourceConfiguration)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[ContainerDatasetAction]
  }
}

