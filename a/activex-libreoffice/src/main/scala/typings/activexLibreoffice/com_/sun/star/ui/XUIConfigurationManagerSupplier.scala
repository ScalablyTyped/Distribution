package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to retrieve the user interface configuration manager related to an object.
  * @since OOo 2.0
  */
@js.native
trait XUIConfigurationManagerSupplier extends XInterface {
  
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  val UIConfigurationManager: XUIConfigurationManager = js.native
  
  /**
    * returns the user interface configuration manager related to the object.
    * @returns an object implementing {@link com.sun.star.ui.UIConfigurationManager} service.
    */
  def getUIConfigurationManager(): XUIConfigurationManager = js.native
}
object XUIConfigurationManagerSupplier {
  
  @scala.inline
  def apply(
    UIConfigurationManager: XUIConfigurationManager,
    acquire: () => Unit,
    getUIConfigurationManager: () => XUIConfigurationManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUIConfigurationManagerSupplier = {
    val __obj = js.Dynamic.literal(UIConfigurationManager = UIConfigurationManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUIConfigurationManager = js.Any.fromFunction0(getUIConfigurationManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUIConfigurationManagerSupplier]
  }
  
  @scala.inline
  implicit class XUIConfigurationManagerSupplierMutableBuilder[Self <: XUIConfigurationManagerSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUIConfigurationManager(value: () => XUIConfigurationManager): Self = StObject.set(x, "getUIConfigurationManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUIConfigurationManager(value: XUIConfigurationManager): Self = StObject.set(x, "UIConfigurationManager", value.asInstanceOf[js.Any])
  }
}
