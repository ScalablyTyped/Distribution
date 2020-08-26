package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XControllerManager} gives access to the controllers of the drawing framework.
  *
  * The {@link XControllerManager} interface is typically implemented by the same object that implements {@link com.sun.star.frame.XController} .
  */
@js.native
trait XControllerManager extends js.Object {
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
  implicit class XControllerManagerOps[Self <: XControllerManager] (val x: Self) extends AnyVal {
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
    def setConfigurationController(value: XConfigurationController): Self = this.set("ConfigurationController", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleController(value: XModuleController): Self = this.set("ModuleController", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetConfigurationController(value: () => XConfigurationController): Self = this.set("getConfigurationController", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModuleController(value: () => XModuleController): Self = this.set("getModuleController", js.Any.fromFunction0(value))
  }
  
}

