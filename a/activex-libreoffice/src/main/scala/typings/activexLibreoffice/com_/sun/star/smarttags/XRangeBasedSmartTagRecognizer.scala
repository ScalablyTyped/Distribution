package typings.activexLibreoffice.com_.sun.star.smarttags

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.text.XTextMarkup
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a range based smart tag recognizer. */
@js.native
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
  ): Unit = js.native
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
  
  @scala.inline
  implicit class XRangeBasedSmartTagRecognizerOps[Self <: XRangeBasedSmartTagRecognizer] (val x: Self) extends AnyVal {
    
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
    def setRecognizeTextRange(value: (XTextRange, SmartTagRecognizerMode, XTextMarkup, String, XController) => Unit): Self = this.set("recognizeTextRange", js.Any.fromFunction5(value))
  }
}
