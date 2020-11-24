package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to an {@link XUndoManager} .
  * @since OOo 3.4
  */
@js.native
trait XUndoManagerSupplier extends js.Object {
  
  /** returns the Undo manager associated with the component. */
  val UndoManager: XUndoManager = js.native
  
  /** returns the Undo manager associated with the component. */
  def getUndoManager(): XUndoManager = js.native
}
object XUndoManagerSupplier {
  
  @scala.inline
  def apply(UndoManager: XUndoManager, getUndoManager: () => XUndoManager): XUndoManagerSupplier = {
    val __obj = js.Dynamic.literal(UndoManager = UndoManager.asInstanceOf[js.Any], getUndoManager = js.Any.fromFunction0(getUndoManager))
    __obj.asInstanceOf[XUndoManagerSupplier]
  }
  
  @scala.inline
  implicit class XUndoManagerSupplierOps[Self <: XUndoManagerSupplier] (val x: Self) extends AnyVal {
    
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
    def setUndoManager(value: XUndoManager): Self = this.set("UndoManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndoManager(value: () => XUndoManager): Self = this.set("getUndoManager", js.Any.fromFunction0(value))
  }
}
