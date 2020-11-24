package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a VCL window implementation. */
@js.native
trait XWindowSupplier extends XInterface {
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: XWindow = js.native
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): XWindow = js.native
}
object XWindowSupplier {
  
  @scala.inline
  def apply(
    Window: XWindow,
    acquire: () => Unit,
    getWindow: () => XWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getWindow = js.Any.fromFunction0(getWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWindowSupplier]
  }
  
  @scala.inline
  implicit class XWindowSupplierOps[Self <: XWindowSupplier] (val x: Self) extends AnyVal {
    
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
    def setWindow(value: XWindow): Self = this.set("Window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWindow(value: () => XWindow): Self = this.set("getWindow", js.Any.fromFunction0(value))
  }
}
