package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", JSImport.Namespace)
@js.native
object leanengineModMembers extends js.Object {
  var applicationId: java.lang.String = js.native
  var applicationKey: java.lang.String = js.native
  var masterKey: java.lang.String = js.native
  /**
       * Call this method first to set up your authentication tokens for AV.
       * @param {String} applicationId Your Application ID.
       * @param {String} applicationKey Your Application Key.
       * @param {String} masterKey (optional) Your Application Master Key. (Node.js only!)
       */
  def initialize(applicationId: java.lang.String, applicationKey: java.lang.String): scala.Unit = js.native
  /**
       * Call this method first to set up your authentication tokens for AV.
       * @param {String} applicationId Your Application ID.
       * @param {String} applicationKey Your Application Key.
       * @param {String} masterKey (optional) Your Application Master Key. (Node.js only!)
       */
  def initialize(applicationId: java.lang.String, applicationKey: java.lang.String, masterKey: java.lang.String): scala.Unit = js.native
}

