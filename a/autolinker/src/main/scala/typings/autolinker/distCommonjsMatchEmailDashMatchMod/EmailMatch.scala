package typings.autolinker.distCommonjsMatchEmailDashMatchMod

import typings.autolinker.distCommonjsMatchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match/email-match", "EmailMatch")
@js.native
class EmailMatch protected () extends Match {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match
    *   instance, specified in an Object (map).
    */
  def this(cfg: EmailMatchConfig) = this()
  /**
    * @cfg {String} email (required)
    *
    * The email address that was matched.
    */
  val email: js.Any = js.native
  /**
    * Returns the email address that was matched.
    *
    * @return {String}
    */
  def getEmail(): String = js.native
}

