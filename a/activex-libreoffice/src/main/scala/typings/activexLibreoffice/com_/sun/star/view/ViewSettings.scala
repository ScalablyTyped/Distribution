package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the settings of the controller of an office document. */
trait ViewSettings
  extends StObject
     with XPropertySet {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowHoriRuler = ShowHoriRuler.asInstanceOf[js.Any], ShowHoriScrollBar = ShowHoriScrollBar.asInstanceOf[js.Any], ShowVertRuler = ShowVertRuler.asInstanceOf[js.Any], ShowVertScrollBar = ShowVertScrollBar.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ViewSettings]
  }
  
  extension [Self <: ViewSettings](x: Self) {
    
    inline def setShowHoriRuler(value: Boolean): Self = StObject.set(x, "ShowHoriRuler", value.asInstanceOf[js.Any])
    
    inline def setShowHoriScrollBar(value: Boolean): Self = StObject.set(x, "ShowHoriScrollBar", value.asInstanceOf[js.Any])
    
    inline def setShowVertRuler(value: Boolean): Self = StObject.set(x, "ShowVertRuler", value.asInstanceOf[js.Any])
    
    inline def setShowVertScrollBar(value: Boolean): Self = StObject.set(x, "ShowVertScrollBar", value.asInstanceOf[js.Any])
    
    inline def setZoomValue(value: Double): Self = StObject.set(x, "ZoomValue", value.asInstanceOf[js.Any])
  }
}
