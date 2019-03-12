package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
trait SingleProofreadingError extends js.Object {
  var aFullComment: java.lang.String
  var aProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  var aRuleIdentifier: java.lang.String
  var aShortComment: java.lang.String
  var aSuggestions: stdLib.SafeArray[java.lang.String]
  var nErrorLength: scala.Double
  var nErrorStart: scala.Double
  var nErrorType: scala.Double
}

object SingleProofreadingError {
  @scala.inline
  def apply(
    aFullComment: java.lang.String,
    aProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aRuleIdentifier: java.lang.String,
    aShortComment: java.lang.String,
    aSuggestions: stdLib.SafeArray[java.lang.String],
    nErrorLength: scala.Double,
    nErrorStart: scala.Double,
    nErrorType: scala.Double
  ): SingleProofreadingError = {
    val __obj = js.Dynamic.literal(aFullComment = aFullComment, aProperties = aProperties, aRuleIdentifier = aRuleIdentifier, aShortComment = aShortComment, aSuggestions = aSuggestions, nErrorLength = nErrorLength, nErrorStart = nErrorStart, nErrorType = nErrorType)
  
    __obj.asInstanceOf[SingleProofreadingError]
  }
}

