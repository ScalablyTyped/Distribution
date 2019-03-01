package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flow extends js.Object {
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): java.lang.String
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): scala.Unit
}

object Flow {
  @scala.inline
  def apply(authorizeUrl: js.Function0[java.lang.String], run: js.Function0[scala.Unit]): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizeUrl")(authorizeUrl)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Flow]
  }
}

