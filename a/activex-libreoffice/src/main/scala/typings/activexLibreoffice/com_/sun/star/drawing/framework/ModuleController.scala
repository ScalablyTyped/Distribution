package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See {@link XModuleController} for a description of the module controller.
  *
  * See {@link ConfigurationController} for a comment why this service may be removed in the future.
  *
  * The {@link ModuleController} object for an application can be obtained via the {@link XControllerManager} interface.
  */
@js.native
trait ModuleController extends XModuleController {
  
  /** Create a new instance of a {@link ModuleController} as sub controller of the given XController object. */
  def create(xController: XController): Unit = js.native
}
object ModuleController {
  
  @scala.inline
  def apply(create: XController => Unit, requestResource: String => Unit): ModuleController = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), requestResource = js.Any.fromFunction1(requestResource))
    __obj.asInstanceOf[ModuleController]
  }
  
  @scala.inline
  implicit class ModuleControllerOps[Self <: ModuleController] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: XController => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
