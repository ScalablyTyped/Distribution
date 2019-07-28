package typings.activexDashLibreoffice.comNs.sunNs.starNs.smarttagsNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextMarkup
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a range based smart tag recognizer. */
trait XRangeBasedSmartTagRecognizer extends XInitialization {
  /**
    * recognizes smart tags.
    * @param xRange The text that should be scanned by the recognizer.
    * @param eDataType This value indicates the type of the passed text.
    * @param xTextMarkup This object is used to submit any recognized smart tags to the calling application.
    * @param aApplicationName A string containing the name of the calling application.
    * @param xController The current controller of the document.
    */
  def recognizeTextRange(
    xRange: XTextRange,
    eDataType: SmartTagRecognizerMode,
    xTextMarkup: XTextMarkup,
    aApplicationName: String,
    xController: XController
  ): Unit
}

object XRangeBasedSmartTagRecognizer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    recognizeTextRange: (XTextRange, SmartTagRecognizerMode, XTextMarkup, String, XController) => Unit,
    release: () => Unit
  ): XRangeBasedSmartTagRecognizer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), recognizeTextRange = js.Any.fromFunction5(recognizeTextRange), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRangeBasedSmartTagRecognizer]
  }
}

