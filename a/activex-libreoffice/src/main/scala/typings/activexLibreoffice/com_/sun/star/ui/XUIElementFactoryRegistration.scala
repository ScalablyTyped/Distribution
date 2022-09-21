package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to query, register and deregister user interface element factories.
  *
  * A user interface element factory is registered for a set of three properties. **Type** a string that identifies a type of a user interface
  * element.**Name** a string that identifies a single user interface element within a type class.**Module** a string that identifies a single module of
  * OpenOffice. A combination of these three property values can uniquely identify every user interface element within OpenOffice.
  *
  * Currently the following user interface element types are defined: **menubar****popupmenu****toolbar****statusbar****floater**
  * @since OOo 2.0
  */
trait XUIElementFactoryRegistration
  extends StObject
     with XInterface {
  
  /**
    * function to retrieve a list of all registered user interface element factories
    * @returns a sequence of sequence of property values which describe every registered user interface element factory. ;  The following properties are defined
    */
  val RegisteredFactories: SafeArray[SafeArray[PropertyValue]]
  
  /**
    * function to remove a previously defined user interface element factory.
    * @param aType a string that identifies a type of a user interface element. Currently the following types are supported: **menubar****toolbar****statusbar**
    * @param aName an optional name of a single user interface element. This name must be unique within a user interface element type class. This value can re
    * @param ModuleIdentifier an optional module name that can be used to deregister a factory only for a single module. This value can remain empty if not a
    */
  def deregisterFactory(aType: String, aName: String, ModuleIdentifier: String): Unit
  
  /**
    * function to retrieve a previously registered user interface element factory.
    * @param ResourceURL a resource URL which identifies a user interface element. A resource URL uses the following syntax: "private:resource/$type/$name". I
    * @param ModuleIdentifier an optional module identifier. This value can remain empty, if a generic factory is requested. The module identifier can be retr
    * @returns a reference to a registered user interface element factory if a factory has been found. An empty reference when no factory has been found. **The
    */
  def getFactory(ResourceURL: String, ModuleIdentifier: String): XUIElementFactory
  
  /**
    * function to retrieve a list of all registered user interface element factories
    * @returns a sequence of sequence of property values which describe every registered user interface element factory. ;  The following properties are defined
    */
  def getRegisteredFactories(): SafeArray[SafeArray[PropertyValue]]
  
  /**
    * function to register a user interface element factory.
    * @param aType a string that identifies a type of a user interface element. Currently the following types are supported: **menubar****toolbar****statusbar**
    * @param aName an optional name of a single user interface element. This name must be unique within a user interface element type class. This value can re
    * @param aModuleIdentifier an optional module identifier that can be used to register a factory only for a single module. This value can remain empty if n
    * @param aFactoryImplementationName a UNO implementation name that can be used by an implementation to create a factory instance.
    */
  def registerFactory(aType: String, aName: String, aModuleIdentifier: String, aFactoryImplementationName: String): Unit
}
object XUIElementFactoryRegistration {
  
  inline def apply(
    RegisteredFactories: SafeArray[SafeArray[PropertyValue]],
    acquire: () => Unit,
    deregisterFactory: (String, String, String) => Unit,
    getFactory: (String, String) => XUIElementFactory,
    getRegisteredFactories: () => SafeArray[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    registerFactory: (String, String, String, String) => Unit,
    release: () => Unit
  ): XUIElementFactoryRegistration = {
    val __obj = js.Dynamic.literal(RegisteredFactories = RegisteredFactories.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), deregisterFactory = js.Any.fromFunction3(deregisterFactory), getFactory = js.Any.fromFunction2(getFactory), getRegisteredFactories = js.Any.fromFunction0(getRegisteredFactories), queryInterface = js.Any.fromFunction1(queryInterface), registerFactory = js.Any.fromFunction4(registerFactory), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIElementFactoryRegistration]
  }
  
  extension [Self <: XUIElementFactoryRegistration](x: Self) {
    
    inline def setDeregisterFactory(value: (String, String, String) => Unit): Self = StObject.set(x, "deregisterFactory", js.Any.fromFunction3(value))
    
    inline def setGetFactory(value: (String, String) => XUIElementFactory): Self = StObject.set(x, "getFactory", js.Any.fromFunction2(value))
    
    inline def setGetRegisteredFactories(value: () => SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "getRegisteredFactories", js.Any.fromFunction0(value))
    
    inline def setRegisterFactory(value: (String, String, String, String) => Unit): Self = StObject.set(x, "registerFactory", js.Any.fromFunction4(value))
    
    inline def setRegisteredFactories(value: SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "RegisteredFactories", value.asInstanceOf[js.Any])
  }
}
