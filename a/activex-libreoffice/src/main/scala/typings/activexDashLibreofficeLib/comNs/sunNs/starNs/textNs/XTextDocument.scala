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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Args")(Args)
    __obj.updateDynamic("CurrentController")(CurrentController)
    __obj.updateDynamic("CurrentSelection")(CurrentSelection)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attachResource")(attachResource)
    __obj.updateDynamic("connectController")(connectController)
    __obj.updateDynamic("disconnectController")(disconnectController)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getArgs")(getArgs)
    __obj.updateDynamic("getCurrentController")(getCurrentController)
    __obj.updateDynamic("getCurrentSelection")(getCurrentSelection)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("hasControllersLocked")(hasControllersLocked)
    __obj.updateDynamic("lockControllers")(lockControllers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("reformat")(reformat)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setCurrentController")(setCurrentController)
    __obj.updateDynamic("unlockControllers")(unlockControllers)
    __obj.asInstanceOf[XTextDocument]
  }
}

