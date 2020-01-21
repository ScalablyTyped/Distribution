package typings.activexWia.WIA

import typings.activexWia.activexWiaStrings.Asterisk
import typings.activexWia.activexWiaStrings.`Leftcurlybracket00000000-0000-0000-0000-000000000000Rightcurlybracket`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Miscellaneous string constants */
/* Rewritten from type alias, can be one of: 
  - typings.activexWia.activexWiaStrings.Asterisk
  - typings.activexWia.activexWiaStrings.`Leftcurlybracket00000000-0000-0000-0000-000000000000Rightcurlybracket`
*/
trait Miscellaneous extends js.Object

object Miscellaneous {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wiaAnyDeviceID: Asterisk = this.cast("*")
  @scala.inline
  def wiaIDUnknown: `Leftcurlybracket00000000-0000-0000-0000-000000000000Rightcurlybracket` = this.cast("{00000000-0000-0000-0000-000000000000}")
}

