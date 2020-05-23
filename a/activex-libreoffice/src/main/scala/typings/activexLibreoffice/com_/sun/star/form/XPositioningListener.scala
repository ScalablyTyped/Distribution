package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to receive notifications about cursor movements into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} .
  * @deprecated Deprecated
  */
trait XPositioningListener extends XEventListener {
  /** is invoked when the database form has been positioned on a data record. */
  def positioned(aEvent: EventObject): Unit
}

object XPositioningListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    positioned: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPositioningListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), positioned = js.Any.fromFunction1(positioned), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPositioningListener]
  }
}

