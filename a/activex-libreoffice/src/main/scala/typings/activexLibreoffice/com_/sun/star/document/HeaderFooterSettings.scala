package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties that control the formatting of headers and footers for documents that do not allow individual settings for individual parts like
  * pages or slides.
  */
trait HeaderFooterSettings
  extends StObject
     with XPropertySet {
  
  /** enables or disables the printing of the date in the header or footer */
  var IsPrintDate: Boolean
  
  /** enables or disables the printing of the page name in the header or footer */
  var IsPrintPageName: Boolean
  
  /** enables or disables the printing of the current time in the header or footer */
  var IsPrintTime: Boolean
}
object HeaderFooterSettings {
  
  inline def apply(
    IsPrintDate: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTime: Boolean,
    PropertySetInfo: XPropertySetInfo,
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
  ): HeaderFooterSettings = {
    val __obj = js.Dynamic.literal(IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[HeaderFooterSettings]
  }
  
  extension [Self <: HeaderFooterSettings](x: Self) {
    
    inline def setIsPrintDate(value: Boolean): Self = StObject.set(x, "IsPrintDate", value.asInstanceOf[js.Any])
    
    inline def setIsPrintPageName(value: Boolean): Self = StObject.set(x, "IsPrintPageName", value.asInstanceOf[js.Any])
    
    inline def setIsPrintTime(value: Boolean): Self = StObject.set(x, "IsPrintTime", value.asInstanceOf[js.Any])
  }
}
