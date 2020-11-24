package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the server-side interface to a weak adapter.
  *
  * The implementation of {@link XAdapter} must know but not hold the adapted object, because it must not affect the lifetime of the adapted object.
  * @see XWeak for description of concepts.
  */
@js.native
trait XAdapter extends XInterface {
  
  /**
    * adds a reference to the adapter.
    *
    * All added references are called when the adapted object dies.
    */
  def addReference(xRef: XReference): Unit = js.native
  
  /** queries the adapted object if it is alive. */
  def queryAdapted(): XInterface = js.native
  
  /** removes a reference from the adapter. */
  def removeReference(xRef: XReference): Unit = js.native
}
object XAdapter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addReference: XReference => Unit,
    queryAdapted: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeReference: XReference => Unit
  ): XAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReference = js.Any.fromFunction1(addReference), queryAdapted = js.Any.fromFunction0(queryAdapted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReference = js.Any.fromFunction1(removeReference))
    __obj.asInstanceOf[XAdapter]
  }
  
  @scala.inline
  implicit class XAdapterOps[Self <: XAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddReference(value: XReference => Unit): Self = this.set("addReference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryAdapted(value: () => XInterface): Self = this.set("queryAdapted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveReference(value: XReference => Unit): Self = this.set("removeReference", js.Any.fromFunction1(value))
  }
}
