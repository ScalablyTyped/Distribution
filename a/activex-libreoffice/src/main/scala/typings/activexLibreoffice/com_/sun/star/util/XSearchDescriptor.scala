package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a string search operation. */
trait XSearchDescriptor
  extends StObject
     with XPropertySet {
  
  /** @returns the string of characters to search for. */
  var SearchString: String
  
  /** @returns the string of characters to search for. */
  def getSearchString(): String
  
  /** sets the string of characters to look for. */
  def setSearchString(aString: String): Unit
}
object XSearchDescriptor {
  
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    SearchString: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSearchString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSearchString: String => Unit
  ): XSearchDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSearchString = js.Any.fromFunction1(setSearchString))
    __obj.asInstanceOf[XSearchDescriptor]
  }
  
  @scala.inline
  implicit class XSearchDescriptorMutableBuilder[Self <: XSearchDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSearchString(value: () => String): Self = StObject.set(x, "getSearchString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSearchString(value: String => Unit): Self = StObject.set(x, "setSearchString", js.Any.fromFunction1(value))
  }
}
