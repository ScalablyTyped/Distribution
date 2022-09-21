package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a singleton, supporting interface-based singletons.
  *
  * This type supersedes {@link XSingletonTypeDescription} , which only supports obsolete, service-based singletons.
  * @since OOo 2.0
  */
trait XSingletonTypeDescription2
  extends StObject
     with XSingletonTypeDescription {
  
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  val Interface: XTypeDescription
  
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  def getInterface(): XTypeDescription
  
  /**
    * Returns whether this object reflects an interface-based singleton.
    * @returns `TRUE` if this object reflects an interface-based singleton, and `FALSE` if this object reflects an obsolete, service-based singleton
    */
  def isInterfaceBased(): Boolean
}
object XSingletonTypeDescription2 {
  
  inline def apply(
    Interface: XTypeDescription,
    Name: String,
    Service: XServiceTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getInterface: () => XTypeDescription,
    getName: () => String,
    getService: () => XServiceTypeDescription,
    getTypeClass: () => TypeClass,
    isInterfaceBased: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSingletonTypeDescription2 = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInterface = js.Any.fromFunction0(getInterface), getName = js.Any.fromFunction0(getName), getService = js.Any.fromFunction0(getService), getTypeClass = js.Any.fromFunction0(getTypeClass), isInterfaceBased = js.Any.fromFunction0(isInterfaceBased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingletonTypeDescription2]
  }
  
  extension [Self <: XSingletonTypeDescription2](x: Self) {
    
    inline def setGetInterface(value: () => XTypeDescription): Self = StObject.set(x, "getInterface", js.Any.fromFunction0(value))
    
    inline def setInterface(value: XTypeDescription): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setIsInterfaceBased(value: () => Boolean): Self = StObject.set(x, "isInterfaceBased", js.Any.fromFunction0(value))
  }
}
