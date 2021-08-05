package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to retrieve user interface configuration managers related to OpenOffice.org modules.
  * @since OOo 2.0
  */
trait XModuleUIConfigurationManagerSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the requested module based user interface configuration manager.
    * @param ModuleIdentifier a module identifier which identifies an OpenOffice.org module. The module identifier can be retrieved from the {@link com.sun.st
    * @returns an object implementing {@link com.sun.star.ui.ModuleUIConfigurationManager} service. If the provided module identifier is unknown a {@link com.su
    */
  def getUIConfigurationManager(ModuleIdentifier: String): XUIConfigurationManager
}
object XModuleUIConfigurationManagerSupplier {
  
  inline def apply(
    acquire: () => Unit,
    getUIConfigurationManager: String => XUIConfigurationManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModuleUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUIConfigurationManager = js.Any.fromFunction1(getUIConfigurationManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleUIConfigurationManagerSupplier]
  }
  
  extension [Self <: XModuleUIConfigurationManagerSupplier](x: Self) {
    
    inline def setGetUIConfigurationManager(value: String => XUIConfigurationManager): Self = StObject.set(x, "getUIConfigurationManager", js.Any.fromFunction1(value))
  }
}
