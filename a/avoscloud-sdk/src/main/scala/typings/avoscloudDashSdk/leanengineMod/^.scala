package typings.avoscloudDashSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var applicationId: String = js.native
  var applicationKey: String = js.native
  var masterKey: String = js.native
  /**
    * Call this method first to set up your authentication tokens for AV.
    * @param {String} applicationId Your Application ID.
    * @param {String} applicationKey Your Application Key.
    * @param {String} masterKey (optional) Your Application Master Key. (Node.js only!)
    */
  def initialize(applicationId: String, applicationKey: String): Unit = js.native
  def initialize(applicationId: String, applicationKey: String, masterKey: String): Unit = js.native
}

