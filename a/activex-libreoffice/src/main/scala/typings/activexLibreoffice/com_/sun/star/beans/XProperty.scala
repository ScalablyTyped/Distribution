package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is implemented by objects that also are a property of some other object.
  *
  * Provides access to traits of this object that would otherwise only be available from a containing {@link XPropertySet} via its {@link
  * XPropertySetInfo} .
  */
trait XProperty
  extends StObject
     with XInterface {
  
  /** @returns the specification of this object as {@link Property} . */
  val AsProperty: Property
  
  /** @returns the specification of this object as {@link Property} . */
  def getAsProperty(): Property
}
object XProperty {
  
  inline def apply(
    AsProperty: Property,
    acquire: () => Unit,
    getAsProperty: () => Property,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XProperty = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAsProperty = js.Any.fromFunction0(getAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XProperty]
  }
  
  extension [Self <: XProperty](x: Self) {
    
    inline def setAsProperty(value: Property): Self = StObject.set(x, "AsProperty", value.asInstanceOf[js.Any])
    
    inline def setGetAsProperty(value: () => Property): Self = StObject.set(x, "getAsProperty", js.Any.fromFunction0(value))
  }
}
