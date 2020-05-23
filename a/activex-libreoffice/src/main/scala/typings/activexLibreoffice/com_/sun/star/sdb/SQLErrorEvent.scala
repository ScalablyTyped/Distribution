package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is invoked in case of fired database exception triggered by a database object. */
trait SQLErrorEvent extends EventObject {
  /** contains the exception that is going to be fired. */
  var Reason: js.Any
}

object SQLErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLErrorEvent]
  }
}

