package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

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
trait XPositioningListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the database form has been positioned on a data record. */
  def positioned(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

