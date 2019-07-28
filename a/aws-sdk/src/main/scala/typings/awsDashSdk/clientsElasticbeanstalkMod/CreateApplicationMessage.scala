package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationMessage extends js.Object {
  /**
    * The name of the application. Constraint: This name must be unique within your account. If the specified name already exists, the action returns an InvalidParameterValue error.
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * Describes the application.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * Specify an application resource lifecycle configuration to prevent your application from accumulating too many versions.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
  /**
    * Specifies the tags applied to the application. Elastic Beanstalk applies these tags only to the application. Environments that you create in the application don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
}

object CreateApplicationMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    Description: Description = null,
    ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = null,
    Tags: Tags = null
  ): CreateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateApplicationMessage]
  }
}

