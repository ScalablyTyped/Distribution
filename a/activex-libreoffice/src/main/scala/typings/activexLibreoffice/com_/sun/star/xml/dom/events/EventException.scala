package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventException extends Exception {
  var code: Double
}

object EventException {
  @scala.inline
  def apply(Context: XInterface, Message: String, code: Double): EventException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventException]
  }
}

