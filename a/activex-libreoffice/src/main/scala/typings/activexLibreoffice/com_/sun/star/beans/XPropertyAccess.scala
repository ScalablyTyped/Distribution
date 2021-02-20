package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access all property values and to set them at once.
  *
  * In most cases this interface will be in addition to {@link XPropertySet} . It is especially useful for remote communication because it lessens the
  * number of calls for getting property values; that is especially important because these calls are necessarily synchronous.
  *
  * Another advantage of this method is that conflicts are avoided if property value restrictions depend on the value of other properties.
  */
@js.native
trait XPropertyAccess extends XInterface {
  
  /** @returns a sequence of all property values within the object in a single call. */
  var PropertyValues: SafeArray[PropertyValue] = js.native
  
  /** @returns a sequence of all property values within the object in a single call. */
  def getPropertyValues(): SafeArray[PropertyValue] = js.native
  
  /**
    * sets the values of given properties.
    *
    * All properties which are not contained in the sequence **aProps** will be left unchanged.
    */
  def setPropertyValues(aProps: SeqEquiv[PropertyValue]): Unit = js.native
}
object XPropertyAccess {
  
  @scala.inline
  def apply(
    PropertyValues: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPropertyValues: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyValues: SeqEquiv[PropertyValue] => Unit
  ): XPropertyAccess = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPropertyValues = js.Any.fromFunction0(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValues = js.Any.fromFunction1(setPropertyValues))
    __obj.asInstanceOf[XPropertyAccess]
  }
  
  @scala.inline
  implicit class XPropertyAccessMutableBuilder[Self <: XPropertyAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPropertyValues(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPropertyValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyValues(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PropertyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPropertyValues(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setPropertyValues", js.Any.fromFunction1(value))
  }
}
