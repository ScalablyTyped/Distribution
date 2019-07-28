package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text conversion result to be used with {@link XTextConversion} .
  * @since OOo 1.1.2
  */
trait TextConversionResult extends js.Object {
  /**
    * The boundary of the first convertible word in the given text.
    *
    * If there is no convertible word found in the text, **startPos** and **endPos** for {@link Boundary} equal 0.
    */
  var Boundary: typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.Boundary
  /** A list of replacement candidates for the first convertible word found in the given text. */
  var Candidates: SafeArray[String]
}

object TextConversionResult {
  @scala.inline
  def apply(Boundary: Boundary, Candidates: SafeArray[String]): TextConversionResult = {
    val __obj = js.Dynamic.literal(Boundary = Boundary, Candidates = Candidates)
  
    __obj.asInstanceOf[TextConversionResult]
  }
}

