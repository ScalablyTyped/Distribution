package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parser results returned by {@link XCharacterClassification.parseAnyToken()} and {@link XCharacterClassification.parsePredefinedToken()} . */
trait ParseResult extends js.Object {
  /** Number of code points (not UTF-16 code units) of the parsed token, not including leading whitespace. */
  var CharLen: Double
  /** {@link KParseTokens} flags of remaining characters of actual token matched. */
  var ContFlags: Double
  /** If a quoted name or string is encountered the dequoted result goes here. */
  var DequotedNameOrString: String
  /** UTF-16 code unit index of first unprocessed character. */
  var EndPos: Double
  /** Count of ignored leading whitespace, in UTF-16 code units, not Unicode code points. */
  var LeadingWhiteSpace: Double
  /**
    * {@link KParseTokens} flags of first character of actual token matched. If **TokenType** is a {@link KParseType.SINGLE_QUOTE_NAME} or a {@link
    * KParseType.DOUBLE_QUOTE_STRING} the first character is the first character inside the quotes, not the quote itself.
    */
  var StartFlags: Double
  /** {@link KParseType} token type like {@link KParseType.IDENTNAME} . */
  var TokenType: Double
  /** Value of token in case of numeric. */
  var Value: Double
}

object ParseResult {
  @scala.inline
  def apply(
    CharLen: Double,
    ContFlags: Double,
    DequotedNameOrString: String,
    EndPos: Double,
    LeadingWhiteSpace: Double,
    StartFlags: Double,
    TokenType: Double,
    Value: Double
  ): ParseResult = {
    val __obj = js.Dynamic.literal(CharLen = CharLen.asInstanceOf[js.Any], ContFlags = ContFlags.asInstanceOf[js.Any], DequotedNameOrString = DequotedNameOrString.asInstanceOf[js.Any], EndPos = EndPos.asInstanceOf[js.Any], LeadingWhiteSpace = LeadingWhiteSpace.asInstanceOf[js.Any], StartFlags = StartFlags.asInstanceOf[js.Any], TokenType = TokenType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
}

