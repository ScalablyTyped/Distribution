package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEnvironmentConfigurationMessage extends js.Object {
  /**
    * The name of the application the environment is associated with.
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * The name of the environment to delete the draft configuration from.
    */
  var EnvironmentName: typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName
}

object DeleteEnvironmentConfigurationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, EnvironmentName: EnvironmentName): DeleteEnvironmentConfigurationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, EnvironmentName = EnvironmentName)
  
    __obj.asInstanceOf[DeleteEnvironmentConfigurationMessage]
  }
}

