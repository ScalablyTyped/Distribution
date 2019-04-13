package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationResourceLifecycleConfig extends js.Object {
  /**
    * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
    */
  var ServiceRole: js.UndefOr[String] = js.undefined
  /**
    * The application version lifecycle configuration.
    */
  var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.undefined
}

object ApplicationResourceLifecycleConfig {
  @scala.inline
  def apply(ServiceRole: String = null, VersionLifecycleConfig: ApplicationVersionLifecycleConfig = null): ApplicationResourceLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (VersionLifecycleConfig != null) __obj.updateDynamic("VersionLifecycleConfig")(VersionLifecycleConfig)
    __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
  }
}

