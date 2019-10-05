package typings.asana.asanaMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flow extends js.Object {
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): String
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): Unit
}

object Flow {
  @scala.inline
  def apply(authorizeUrl: () => String, run: () => Unit): Flow = {
    val __obj = js.Dynamic.literal(authorizeUrl = js.Any.fromFunction0(authorizeUrl), run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[Flow]
  }
}

