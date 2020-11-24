package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
@js.native
trait XVclContainer extends XInterface {
  
  /** returns all windows. */
  val Windows: SafeArray[XWindow] = js.native
  
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): Unit = js.native
  
  /** returns all windows. */
  def getWindows(): SafeArray[XWindow] = js.native
  
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): Unit = js.native
}
object XVclContainer {
  
  @scala.inline
  def apply(
    Windows: SafeArray[XWindow],
    acquire: () => Unit,
    addVclContainerListener: XVclContainerListener => Unit,
    getWindows: () => SafeArray[XWindow],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeVclContainerListener: XVclContainerListener => Unit
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addVclContainerListener = js.Any.fromFunction1(addVclContainerListener), getWindows = js.Any.fromFunction0(getWindows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeVclContainerListener = js.Any.fromFunction1(removeVclContainerListener))
    __obj.asInstanceOf[XVclContainer]
  }
  
  @scala.inline
  implicit class XVclContainerOps[Self <: XVclContainer] (val x: Self) extends AnyVal {
    
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
    def setWindows(value: SafeArray[XWindow]): Self = this.set("Windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddVclContainerListener(value: XVclContainerListener => Unit): Self = this.set("addVclContainerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindows(value: () => SafeArray[XWindow]): Self = this.set("getWindows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveVclContainerListener(value: XVclContainerListener => Unit): Self = this.set("removeVclContainerListener", js.Any.fromFunction1(value))
  }
}
