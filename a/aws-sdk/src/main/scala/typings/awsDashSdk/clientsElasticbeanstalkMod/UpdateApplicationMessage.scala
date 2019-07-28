package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationMessage extends js.Object {
  /**
    * The name of the application to update. If no such application is found, UpdateApplication returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * A new description for the application. Default: If not specified, AWS Elastic Beanstalk does not update the description.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
}

object UpdateApplicationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, Description: Description = null): UpdateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateApplicationMessage]
  }
}

