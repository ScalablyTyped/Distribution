package typings.autolinker.phoneMatchMod

import typings.autolinker.matchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match/phone-match", "PhoneMatch")
@js.native
class PhoneMatch protected () extends Match {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match
    *   instance, specified in an Object (map).
    */
  def this(cfg: PhoneMatchConfig) = this()
  /**
    * @protected
    * @property {String} number (required)
    *
    * The phone number that was matched, without any delimiter characters.
    *
    * Note: This is a string to allow for prefixed 0's.
    */
  val number: js.Any = js.native
  /**
    * @protected
    * @property  {Boolean} plusSign (required)
    *
    * `true` if the matched phone number started with a '+' sign. We'll include
    * it in the `tel:` URL if so, as this is needed for international numbers.
    *
    * Ex: '+1 (123) 456 7879'
    */
  val plusSign: js.Any = js.native
  /**
    * Alias of {@link #getPhoneNumber}, returns the phone number that was
    * matched as a string, without any delimiter characters.
    *
    * Note: This is a string to allow for prefixed 0's.
    *
    * @return {String}
    */
  def getNumber(): String = js.native
  /**
    * Returns the phone number that was matched as a string, without any
    * delimiter characters.
    *
    * Note: This is a string to allow for prefixed 0's.
    *
    * @return {String}
    */
  def getPhoneNumber(): String = js.native
}

