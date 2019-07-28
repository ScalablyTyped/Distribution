package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the main interface of a text document.
  * @see com.sun.star.text.TextDocument
  */
trait XTextDocument extends XModel {
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText
  /** reformats the contents of the document. */
  def reformat(): Unit
}

object XTextDocument {
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Text: XText,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArgs: () => SafeArray[PropertyValue],
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getText: () => XText,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    reformat: () => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setCurrentController: XController => Unit,
    unlockControllers: () => Unit
  ): XTextDocument = {
    val __obj = js.Dynamic.literal(Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Text = Text, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getText = js.Any.fromFunction0(getText), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), reformat = js.Any.fromFunction0(reformat), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XTextDocument]
  }
}

