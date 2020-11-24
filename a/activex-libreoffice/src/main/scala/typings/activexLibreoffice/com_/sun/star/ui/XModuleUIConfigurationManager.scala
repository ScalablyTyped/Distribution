package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies specific functions of a module based user interface configuration manager interface.
  *
  * A module user interface configuration manager supports, unlike a document based ui configuration manager, two layers of configuration settings data: ;
  *  1. Layer: A module default user interface configuration which describe all user interface elements settings that are used by OpenOffice. It is not
  * possible to insert, remove or change elements settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which
  * only contains customized user interface elements and user-defined ones. All changes on user interface element settings are done on this layer. This
  * layer is the same as the document ui configuration manager uses.
  * @since OOo 2.0
  */
@js.native
trait XModuleUIConfigurationManager extends XInterface {
  
  /**
    * retrieves the settings from the default layer of the user interface configuration manager if it has a default layer.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if default settings have been found in the default layer, otherwise `FALSE` .
    */
  def getDefaultSettings(ResourceURL: String): XIndexAccess = js.native
  
  /**
    * determine if the settings of a user interface element is part of the default layer of the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found in the default layer, otherwise `FALSE` .
    */
  def isDefaultSettings(ResourceURL: String): Boolean = js.native
}
object XModuleUIConfigurationManager {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDefaultSettings: String => XIndexAccess,
    isDefaultSettings: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleUIConfigurationManager]
  }
  
  @scala.inline
  implicit class XModuleUIConfigurationManagerOps[Self <: XModuleUIConfigurationManager] (val x: Self) extends AnyVal {
    
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
    def setGetDefaultSettings(value: String => XIndexAccess): Self = this.set("getDefaultSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDefaultSettings(value: String => Boolean): Self = this.set("isDefaultSettings", js.Any.fromFunction1(value))
  }
}
