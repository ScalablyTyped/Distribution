package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a component which can default-fill the help section of an {@link ObjectInspector} .
  *
  * The component registers a {@link XPropertyControlObserver} at an XObjectInspectoryUI interface. Whenever it then is notified of a {@link
  * XPropertyControl} getting the focus, it will try to deduce the extended help text of this control's window, and set this help text at the object
  * inspector's help section.
  */
trait DefaultHelpProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a help provider instance
    * @param InspectorUI provides access to the UI of the {@link ObjectInspector} which should be observed. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if the given inspector UI is `NULL` .
    */
  def create(InspectorUI: XObjectInspectorUI): scala.Unit
}

object DefaultHelpProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    create: js.Function1[XObjectInspectorUI, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DefaultHelpProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, create = create, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[DefaultHelpProvider]
  }
}

