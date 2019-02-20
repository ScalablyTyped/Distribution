package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a range based smart tag recognizer. */
trait XRangeBasedSmartTagRecognizer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /**
    * recognizes smart tags.
    * @param xRange The text that should be scanned by the recognizer.
    * @param eDataType This value indicates the type of the passed text.
    * @param xTextMarkup This object is used to submit any recognized smart tags to the calling application.
    * @param aApplicationName A string containing the name of the calling application.
    * @param xController The current controller of the document.
    */
  def recognizeTextRange(
    xRange: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    eDataType: SmartTagRecognizerMode,
    xTextMarkup: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextMarkup,
    aApplicationName: java.lang.String,
    xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController
  ): scala.Unit
}

