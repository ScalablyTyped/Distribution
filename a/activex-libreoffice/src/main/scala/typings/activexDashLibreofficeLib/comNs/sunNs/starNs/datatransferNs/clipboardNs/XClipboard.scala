package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XClipboard
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Contents: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  val Name: java.lang.String
  /**
    * To get the current content of the clipboard.
    * @returns The transferable object representing the current content of this clipboard.
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getContents(): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  /**
    * To get the name of the clipboard instance.
    * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
    */
  def getName(): java.lang.String
  /**
    * Sets the current contents of the clipboard to the specified transferable object and registers the specified clipboard owner as the owner of the new
    * contents.
    * @param xTrans The transferable object to set as new content. If the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.dat
    * @param xClipboardOwner The new owner of the clipboard. NULL is an acceptable value and means that the caller is not interested in lost ownership notific
    * @see com.sun.star.datatransfer.XTransferable
    * @see com.sun.star.datatransfer.clipboard.XClipboardOwner
    */
  def setContents(
    xTrans: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    xClipboardOwner: XClipboardOwner
  ): scala.Unit
}

object XClipboard {
  @scala.inline
  def apply(
    Contents: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getContents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setContents: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      XClipboardOwner, 
      scala.Unit
    ]
  ): XClipboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contents")(Contents)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getContents")(getContents)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setContents")(setContents)
    __obj.asInstanceOf[XClipboard]
  }
}

