package typings.activexLibreoffice.com_.sun.star.drawing.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XControllerManager} gives access to the controllers of the drawing framework.
  *
  * The {@link XControllerManager} interface is typically implemented by the same object that implements {@link com.sun.star.frame.XController} .
  */
@js.native
trait XControllerManager extends StObject {
  
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  val ConfigurationController: XConfigurationController = js.native
  
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  val ModuleController: XModuleController = js.native
  
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  def getConfigurationController(): XConfigurationController = js.native
  
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  def getModuleController(): XModuleController = js.native
}
object XControllerManager {
  
  @scala.inline
  def apply(
    ConfigurationController: XConfigurationController,
    ModuleController: XModuleController,
    getConfigurationController: () => XConfigurationController,
    getModuleController: () => XModuleController
  ): XControllerManager = {
    val __obj = js.Dynamic.literal(ConfigurationController = ConfigurationController.asInstanceOf[js.Any], ModuleController = ModuleController.asInstanceOf[js.Any], getConfigurationController = js.Any.fromFunction0(getConfigurationController), getModuleController = js.Any.fromFunction0(getModuleController))
    __obj.asInstanceOf[XControllerManager]
  }
  
  @scala.inline
  implicit class XControllerManagerMutableBuilder[Self <: XControllerManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationController(value: XConfigurationController): Self = StObject.set(x, "ConfigurationController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConfigurationController(value: () => XConfigurationController): Self = StObject.set(x, "getConfigurationController", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModuleController(value: () => XModuleController): Self = StObject.set(x, "getModuleController", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModuleController(value: XModuleController): Self = StObject.set(x, "ModuleController", value.asInstanceOf[js.Any])
  }
}
