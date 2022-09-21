package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a string replace operation. */
trait XReplaceDescriptor
  extends StObject
     with XSearchDescriptor {
  
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: String
  
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): String
  
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: String): Unit
}
object XReplaceDescriptor {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceString: String,
    SearchString: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getReplaceString: () => String,
    getSearchString: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit,
    setReplaceString: String => Unit,
    setSearchString: String => Unit
  ): XReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchString = js.Any.fromFunction1(setSearchString))
    __obj.asInstanceOf[XReplaceDescriptor]
  }
  
  extension [Self <: XReplaceDescriptor](x: Self) {
    
    inline def setGetReplaceString(value: () => String): Self = StObject.set(x, "getReplaceString", js.Any.fromFunction0(value))
    
    inline def setReplaceString(value: String): Self = StObject.set(x, "ReplaceString", value.asInstanceOf[js.Any])
    
    inline def setSetReplaceString(value: String => Unit): Self = StObject.set(x, "setReplaceString", js.Any.fromFunction1(value))
  }
}
