package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is thrown when a {@link NumberFormat} string is syntactically incorrect. */
trait MalformedNumberFormatException extends Exception {
  /** contains the character position in the string where the malformation begins. */
  var CheckPos: Double
}

object MalformedNumberFormatException {
  @scala.inline
  def apply(CheckPos: Double, Context: XInterface, Message: String): MalformedNumberFormatException = {
    val __obj = js.Dynamic.literal(CheckPos = CheckPos.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MalformedNumberFormatException]
  }
}

