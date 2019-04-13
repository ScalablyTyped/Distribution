package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectLockConfigurationOutput extends js.Object {
  /**
    * The specified bucket's Object Lock configuration.
    */
  var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined
}

object GetObjectLockConfigurationOutput {
  @scala.inline
  def apply(ObjectLockConfiguration: ObjectLockConfiguration = null): GetObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (ObjectLockConfiguration != null) __obj.updateDynamic("ObjectLockConfiguration")(ObjectLockConfiguration)
    __obj.asInstanceOf[GetObjectLockConfigurationOutput]
  }
}

