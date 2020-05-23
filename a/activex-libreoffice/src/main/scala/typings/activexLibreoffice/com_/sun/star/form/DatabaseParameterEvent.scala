package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is fired if values for parameters are needed. */
trait DatabaseParameterEvent extends EventObject {
  /**
    * specifies the list of parameters which are required for opening a result set.
    *
    * Usually, a {@link com.sun.star.form.component.DataForm} fires this event when loading the form requires parameters to be filled in.
    *
    * Every parameter object supports the {@link com.sun.star.beans.XPropertySet} interface, and at least the properties **Name** and **Value**
    * @see com.sun.star.sdb.RowSet
    * @see com.sun.star.form.component.DataForm
    */
  var Parameters: XIndexAccess
}

object DatabaseParameterEvent {
  @scala.inline
  def apply(Parameters: XIndexAccess, Source: XInterface): DatabaseParameterEvent = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseParameterEvent]
  }
}

