package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the controller of an office document. */
trait ViewSettings extends XPropertySet {
  /** If this property is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: Boolean
  /** If this property is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: Boolean
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: Boolean
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: Boolean
  /** specifies the zoom-value in percent. */
  var ZoomValue: Double
}

object ViewSettings {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ShowHoriRuler: Boolean,
    ShowHoriScrollBar: Boolean,
    ShowVertRuler: Boolean,
    ShowVertScrollBar: Boolean,
    ZoomValue: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ShowHoriRuler = ShowHoriRuler, ShowHoriScrollBar = ShowHoriScrollBar, ShowVertRuler = ShowVertRuler, ShowVertScrollBar = ShowVertScrollBar, ZoomValue = ZoomValue, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ViewSettings]
  }
}

