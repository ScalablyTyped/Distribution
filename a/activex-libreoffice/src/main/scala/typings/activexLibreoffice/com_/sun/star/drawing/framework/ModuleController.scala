package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See {@link XModuleController} for a description of the module controller.
  *
  * See {@link ConfigurationController} for a comment why this service may be removed in the future.
  *
  * The {@link ModuleController} object for an application can be obtained via the {@link XControllerManager} interface.
  */
trait ModuleController
  extends StObject
     with XModuleController {
  
  /** Create a new instance of a {@link ModuleController} as sub controller of the given XController object. */
  def create(xController: XController): Unit
}
object ModuleController {
  
  inline def apply(create: XController => Unit, requestResource: String => Unit): ModuleController = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), requestResource = js.Any.fromFunction1(requestResource))
    __obj.asInstanceOf[ModuleController]
  }
  
  extension [Self <: ModuleController](x: Self) {
    
    inline def setCreate(value: XController => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
