package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Factory interface for creating component instances giving a context from which to retrieve deployment values.
  * @see XInitialization
  */
trait XMultiComponentFactory
  extends StObject
     with XInterface {
  
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  val AvailableServiceNames: SafeArray[String]
  
  /**
    * Creates an instance of a component which supports the services specified by the factory, and initializes the new instance with the given arguments and
    * context.
    * @param ServiceSpecifier service name
    * @param Arguments arguments
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithArgumentsAndContext(ServiceSpecifier: String, Arguments: SeqEquiv[Any], Context: XComponentContext): XInterface
  
  /**
    * Creates an instance of a component which supports the services specified by the factory.
    * @param aServiceSpecifier service name
    * @param Context context the component instance gets its deployment values from
    * @returns component instance
    */
  def createInstanceWithContext(aServiceSpecifier: String, Context: XComponentContext): XInterface
  
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  def getAvailableServiceNames(): SafeArray[String]
}
object XMultiComponentFactory {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createInstanceWithArgumentsAndContext: (String, SeqEquiv[Any], XComponentContext) => XInterface,
    createInstanceWithContext: (String, XComponentContext) => XInterface,
    getAvailableServiceNames: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMultiComponentFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInstanceWithArgumentsAndContext = js.Any.fromFunction3(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction2(createInstanceWithContext), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMultiComponentFactory]
  }
  
  extension [Self <: XMultiComponentFactory](x: Self) {
    
    inline def setAvailableServiceNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableServiceNames", value.asInstanceOf[js.Any])
    
    inline def setCreateInstanceWithArgumentsAndContext(value: (String, SeqEquiv[Any], XComponentContext) => XInterface): Self = StObject.set(x, "createInstanceWithArgumentsAndContext", js.Any.fromFunction3(value))
    
    inline def setCreateInstanceWithContext(value: (String, XComponentContext) => XInterface): Self = StObject.set(x, "createInstanceWithContext", js.Any.fromFunction2(value))
    
    inline def setGetAvailableServiceNames(value: () => SafeArray[String]): Self = StObject.set(x, "getAvailableServiceNames", js.Any.fromFunction0(value))
  }
}
