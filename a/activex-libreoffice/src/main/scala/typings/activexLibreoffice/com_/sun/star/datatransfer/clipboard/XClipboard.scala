package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XClipboard extends XInterface {
  
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Contents: XTransferable = js.native
  
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  val Name: String = js.native
  
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getContents(): XTransferable = js.native
  
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  def getName(): String = js.native
  
  /**
    * Sets the current contents of the clipboard to the specified transferable object and registers the specified clipboard owner as the owner of the new
    * contents.
    * @param xTrans The transferable object to set as new content. If the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.dat
    * @param xClipboardOwner The new owner of the clipboard. NULL is an acceptable value and means that the caller is not interested in lost ownership notific
    * @see com.sun.star.datatransfer.XTransferable
    * @see com.sun.star.datatransfer.clipboard.XClipboardOwner
    */
  def setContents(xTrans: XTransferable, xClipboardOwner: XClipboardOwner): Unit = js.native
}
object XClipboard {
  
  @scala.inline
  def apply(
    Contents: XTransferable,
    Name: String,
    acquire: () => Unit,
    getContents: () => XTransferable,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContents: (XTransferable, XClipboardOwner) => Unit
  ): XClipboard = {
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContents = js.Any.fromFunction2(setContents))
    __obj.asInstanceOf[XClipboard]
  }
  
  @scala.inline
  implicit class XClipboardOps[Self <: XClipboard] (val x: Self) extends AnyVal {
    
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
    def setContents(value: XTransferable): Self = this.set("Contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContents(value: () => XTransferable): Self = this.set("getContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContents(value: (XTransferable, XClipboardOwner) => Unit): Self = this.set("setContents", js.Any.fromFunction2(value))
  }
}
