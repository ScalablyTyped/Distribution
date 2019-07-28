package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationResourceLifecycleMessage extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
}

object UpdateApplicationResourceLifecycleMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, ResourceLifecycleConfig: ApplicationResourceLifecycleConfig): UpdateApplicationResourceLifecycleMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, ResourceLifecycleConfig = ResourceLifecycleConfig)
  
    __obj.asInstanceOf[UpdateApplicationResourceLifecycleMessage]
  }
}

