package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait XModuleUIConfigurationManager
  extends StObject
     with XInterface {
  
  /**
    * retrieves the settings from the default layer of the user interface configuration manager if it has a default layer.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if default settings have been found in the default layer, otherwise `FALSE` .
    */
  def getDefaultSettings(ResourceURL: String): XIndexAccess
  
  /**
    * determine if the settings of a user interface element is part of the default layer of the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found in the default layer, otherwise `FALSE` .
    */
  def isDefaultSettings(ResourceURL: String): Boolean
}
object XModuleUIConfigurationManager {
  
  inline def apply(
    acquire: () => Unit,
    getDefaultSettings: String => XIndexAccess,
    isDefaultSettings: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XModuleUIConfigurationManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XModuleUIConfigurationManager] (val x: Self) extends AnyVal {
    
    inline def setGetDefaultSettings(value: String => XIndexAccess): Self = StObject.set(x, "getDefaultSettings", js.Any.fromFunction1(value))
    
    inline def setIsDefaultSettings(value: String => Boolean): Self = StObject.set(x, "isDefaultSettings", js.Any.fromFunction1(value))
  }
}
