package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the main interface of a text document.
  * @see com.sun.star.text.TextDocument
  */
trait XTextDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel {
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText
  /** reformats the contents of the document. */
  def reformat(): scala.Unit
}

object XTextDocument {
  @scala.inline
  def apply(
    Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Text: XText,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachResource: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    connectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    disconnectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getArgs: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCurrentController: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController],
    getCurrentSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getText: js.Function0[XText],
    getURL: js.Function0[java.lang.String],
    hasControllersLocked: js.Function0[scala.Boolean],
    lockControllers: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    reformat: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setCurrentController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    unlockControllers: js.Function0[scala.Unit]
  ): XTextDocument = {
    val __obj = js.Dynamic.literal(Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Text = Text, URL = URL, acquire = acquire, addEventListener = addEventListener, attachResource = attachResource, connectController = connectController, disconnectController = disconnectController, dispose = dispose, getArgs = getArgs, getCurrentController = getCurrentController, getCurrentSelection = getCurrentSelection, getText = getText, getURL = getURL, hasControllersLocked = hasControllersLocked, lockControllers = lockControllers, queryInterface = queryInterface, reformat = reformat, release = release, removeEventListener = removeEventListener, setCurrentController = setCurrentController, unlockControllers = unlockControllers)
  
    __obj.asInstanceOf[XTextDocument]
  }
}

