package typings.avoscloudDashSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "initialize")
@js.native
object initialize extends js.Object {
  /**
    * Call this method first to set up your authentication tokens for AV.
    * @param {String} applicationId Your Application ID.
    * @param {String} applicationKey Your Application Key.
    * @param {String} masterKey (optional) Your Application Master Key. (Node.js only!)
    */
  def apply(applicationId: String, applicationKey: String): Unit = js.native
  def apply(applicationId: String, applicationKey: String, masterKey: String): Unit = js.native
}

