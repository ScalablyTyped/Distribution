package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to register for title changed events. */
@js.native
trait XTitleChangeBroadcaster extends XInterface {
  
  /** Add a listener */
  def addTitleChangeListener(xListener: XTitleChangeListener): Unit = js.native
  
  /** Remove a listener */
  def removeTitleChangeListener(xListener: XTitleChangeListener): Unit = js.native
}
object XTitleChangeBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addTitleChangeListener: XTitleChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTitleChangeListener: XTitleChangeListener => Unit
  ): XTitleChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener))
    __obj.asInstanceOf[XTitleChangeBroadcaster]
  }
  
  @scala.inline
  implicit class XTitleChangeBroadcasterOps[Self <: XTitleChangeBroadcaster] (val x: Self) extends AnyVal {
    
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
    def setAddTitleChangeListener(value: XTitleChangeListener => Unit): Self = this.set("addTitleChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTitleChangeListener(value: XTitleChangeListener => Unit): Self = this.set("removeTitleChangeListener", js.Any.fromFunction1(value))
  }
}
