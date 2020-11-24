package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to retrieve user interface configuration managers related to OpenOffice.org modules.
  * @since OOo 2.0
  */
@js.native
trait XModuleUIConfigurationManagerSupplier extends XInterface {
  
  /**
    * returns the requested module based user interface configuration manager.
    * @param ModuleIdentifier a module identifier which identifies an OpenOffice.org module. The module identifier can be retrieved from the {@link com.sun.st
    * @returns an object implementing {@link com.sun.star.ui.ModuleUIConfigurationManager} service. If the provided module identifier is unknown a {@link com.su
    */
  def getUIConfigurationManager(ModuleIdentifier: String): XUIConfigurationManager = js.native
}
object XModuleUIConfigurationManagerSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getUIConfigurationManager: String => XUIConfigurationManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModuleUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUIConfigurationManager = js.Any.fromFunction1(getUIConfigurationManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleUIConfigurationManagerSupplier]
  }
  
  @scala.inline
  implicit class XModuleUIConfigurationManagerSupplierOps[Self <: XModuleUIConfigurationManagerSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetUIConfigurationManager(value: String => XUIConfigurationManager): Self = this.set("getUIConfigurationManager", js.Any.fromFunction1(value))
  }
}
