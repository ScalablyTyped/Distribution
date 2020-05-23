package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
trait SingleProofreadingError extends js.Object {
  var aFullComment: String
  var aProperties: SafeArray[PropertyValue]
  var aRuleIdentifier: String
  var aShortComment: String
  var aSuggestions: SafeArray[String]
  var nErrorLength: Double
  var nErrorStart: Double
  var nErrorType: Double
}

object SingleProofreadingError {
  @scala.inline
  def apply(
    aFullComment: String,
    aProperties: SafeArray[PropertyValue],
    aRuleIdentifier: String,
    aShortComment: String,
    aSuggestions: SafeArray[String],
    nErrorLength: Double,
    nErrorStart: Double,
    nErrorType: Double
  ): SingleProofreadingError = {
    val __obj = js.Dynamic.literal(aFullComment = aFullComment.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aRuleIdentifier = aRuleIdentifier.asInstanceOf[js.Any], aShortComment = aShortComment.asInstanceOf[js.Any], aSuggestions = aSuggestions.asInstanceOf[js.Any], nErrorLength = nErrorLength.asInstanceOf[js.Any], nErrorStart = nErrorStart.asInstanceOf[js.Any], nErrorType = nErrorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleProofreadingError]
  }
}

