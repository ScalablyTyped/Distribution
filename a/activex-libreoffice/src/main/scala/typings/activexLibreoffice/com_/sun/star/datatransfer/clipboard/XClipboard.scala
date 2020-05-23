package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XClipboard extends XInterface {
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Contents: XTransferable
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  val Name: String
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getContents(): XTransferable
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  def getName(): String
  /**
    * Sets the current contents of the clipboard to the specified transferable object and registers the specified clipboard owner as the owner of the new
    * contents.
    * @param xTrans The transferable object to set as new content. If the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.dat
    * @param xClipboardOwner The new owner of the clipboard. NULL is an acceptable value and means that the caller is not interested in lost ownership notific
    * @see com.sun.star.datatransfer.XTransferable
    * @see com.sun.star.datatransfer.clipboard.XClipboardOwner
    */
  def setContents(xTrans: XTransferable, xClipboardOwner: XClipboardOwner): Unit
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
}

