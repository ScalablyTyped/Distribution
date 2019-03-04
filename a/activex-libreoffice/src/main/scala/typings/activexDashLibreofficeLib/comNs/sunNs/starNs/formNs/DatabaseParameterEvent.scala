package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is fired if values for parameters are needed. */
trait DatabaseParameterEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the list of parameters which are required for opening a result set.
    *
    * Usually, a {@link com.sun.star.form.component.DataForm} fires this event when loading the form requires parameters to be filled in.
    *
    * Every parameter object supports the {@link com.sun.star.beans.XPropertySet} interface, and at least the properties **Name** and **Value**
    * @see com.sun.star.sdb.RowSet
    * @see com.sun.star.form.component.DataForm
    */
  var Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object DatabaseParameterEvent {
  @scala.inline
  def apply(
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): DatabaseParameterEvent = {
    val __obj = js.Dynamic.literal(Parameters = Parameters, Source = Source)
  
    __obj.asInstanceOf[DatabaseParameterEvent]
  }
}

