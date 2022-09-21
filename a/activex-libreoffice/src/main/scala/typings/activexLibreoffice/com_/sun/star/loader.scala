package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.registry.XRegistryKey
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loader {
  
  /**
    * indicates an error during component activation
    *
    * This exception is thrown when an application tries to activate a component factory using the {@link XImplementationLoader.activate()} method, but the
    * component factory can not be activated.
    *
    * Possible reasons for this error is a missing shared library or .jar file, a badly linked library, a wrong LD_LIBRARY_PATH or PATH, an incomplete
    * classpath, or a missing java installation. The Message should contain some more detailed explanations.
    */
  type CannotActivateFactoryException = Exception
  
  /**
    * Makes it possible to access services accessible via a `UnoUrlResolver` E.g., instantiation of services in another process. This service is still in an
    * experimental state and should not be used in a production environment.
    *
    * Is used to write persistent information into the given registry for accessing a `SingleServiceFactory` and for activating this implementation.
    *
    * Allows registration and activation of described service. The url parameter has to be a comma-separated list of attributes. The following attribute
    * types are understood: servicename = the service name to register this component under link = a parameter given to a resolver to get a
    * `SingleServiceFactory` resolver = a `UnoUrlResolver` service, which is used to resolve the link
    */
  type Dynamic = XImplementationLoader
  
  /**
    * Allows to access a java component stored with a .jar file.
    *
    * Is used for writing persistent information in the registry for external implementation and for activating this implementation. The locationUrls must
    * be absolute file urls.
    */
  type Java = XImplementationLoader
  
  /**
    * the same as {@link com.sun.star.loader.Java} .
    *
    * This service was introduced for UNO 3 components. The then {@link com.sun.star.loader.Java} service was intended for UNO 2 components. Since UNO 2 is
    * not supported anymore, the service name is reused again.
    * @deprecated Deprecated
    */
  type Java2 = XImplementationLoader
  
  /**
    * Allows to access a native component stored in a shared library.
    *
    * Is used for writing persistent information in the registry for an external implementation and for activating this implementation.
    */
  type SharedLibrary = XImplementationLoader
  
  /**
    * handles activation (loading) of a UNO component.
    * @see com.sun.star.registry.XImplementationRegistration
    */
  trait XImplementationLoader
    extends StObject
       with XInterface {
    
    /**
      * activates a concrete implementation within a component.
      * @param implementationName The name of the implementation, which shall be instantiated. The method {@link XImplementationLoader.writeRegistryInfo()} writ
      * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
      * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
      * @param xKey A registry which may be used to read static data previously written via {@link XImplementationLoader.writeRegistryInfo()} . The use of this
      * @returns returns a factory interface, which allows to create an instance of the concrete implementation. In general, the object supports a {@link com.sun.
      */
    def activate(
      implementationName: String,
      implementationLoaderUrl: String,
      locationUrl: String,
      xKey: XRegistryKey
    ): XInterface
    
    /**
      * writes a list of all implementations hosted by this component into a registry key.
      *
      * This method is called during registering a component.
      * @param xKey The registry key, which shall be used to write for each implementation the implementation name plus a list of supported services.
      * @param implementationLoaderUrl specification bug, ignore this parameter, please pass an empty string.
      * @param locationUrl Points to the location of the file containing the component (for instance a .jar-file or a shared library). This parameter should be
      * @see com.sun.star.registry.XImplementationRegistration
      */
    def writeRegistryInfo(xKey: XRegistryKey, implementationLoaderUrl: String, locationUrl: String): Boolean
  }
  object XImplementationLoader {
    
    inline def apply(
      acquire: () => Unit,
      activate: (String, String, String, XRegistryKey) => XInterface,
      queryInterface: `type` => Any,
      release: () => Unit,
      writeRegistryInfo: (XRegistryKey, String, String) => Boolean
    ): XImplementationLoader = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction4(activate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeRegistryInfo = js.Any.fromFunction3(writeRegistryInfo))
      __obj.asInstanceOf[XImplementationLoader]
    }
    
    extension [Self <: XImplementationLoader](x: Self) {
      
      inline def setActivate(value: (String, String, String, XRegistryKey) => XInterface): Self = StObject.set(x, "activate", js.Any.fromFunction4(value))
      
      inline def setWriteRegistryInfo(value: (XRegistryKey, String, String) => Boolean): Self = StObject.set(x, "writeRegistryInfo", js.Any.fromFunction3(value))
    }
  }
}
