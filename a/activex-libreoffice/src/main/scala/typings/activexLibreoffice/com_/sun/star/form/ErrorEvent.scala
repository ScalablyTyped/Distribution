package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * occurs in case of fired database exceptions triggered by a database form.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait ErrorEvent extends EventObject {
  var Reason: js.Any
}

object ErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): ErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}

