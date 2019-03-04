package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the controller of an office document. */
trait ViewSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** If this property is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: scala.Boolean
  /** If this property is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: scala.Boolean
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: scala.Boolean
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: scala.Boolean
  /** specifies the zoom-value in percent. */
  var ZoomValue: scala.Double
}

object ViewSettings {
  @scala.inline
  def apply(
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ShowHoriRuler: scala.Boolean,
    ShowHoriScrollBar: scala.Boolean,
    ShowVertRuler: scala.Boolean,
    ShowVertScrollBar: scala.Boolean,
    ZoomValue: scala.Double,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, ShowHoriRuler = ShowHoriRuler, ShowHoriScrollBar = ShowHoriScrollBar, ShowVertRuler = ShowVertRuler, ShowVertScrollBar = ShowVertScrollBar, ZoomValue = ZoomValue, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[ViewSettings]
  }
}

