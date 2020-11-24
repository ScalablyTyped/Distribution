package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for flushable clipboards may optionally be implemented by a system clipboard service.
  * @see com.sun.star.datatransfer.clipboard.SystemClipboard
  */
@js.native
trait XFlushableClipboard extends XInterface {
  
  /** Renders the current content of the clipboard to the system so that it is available even if the source application no longer exist. */
  def flushClipboard(): Unit = js.native
}
object XFlushableClipboard {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    flushClipboard: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlushableClipboard = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), flushClipboard = js.Any.fromFunction0(flushClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlushableClipboard]
  }
  
  @scala.inline
  implicit class XFlushableClipboardOps[Self <: XFlushableClipboard] (val x: Self) extends AnyVal {
    
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
    def setFlushClipboard(value: () => Unit): Self = this.set("flushClipboard", js.Any.fromFunction0(value))
  }
}
