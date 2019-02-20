package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parser results returned by {@link XCharacterClassification.parseAnyToken()} and {@link XCharacterClassification.parsePredefinedToken()} . */
trait ParseResult extends js.Object {
  /** Number of code points (not UTF-16 code units) of the parsed token, not including leading whitespace. */
  var CharLen: scala.Double
  /** {@link KParseTokens} flags of remaining characters of actual token matched. */
  var ContFlags: scala.Double
  /** If a quoted name or string is encountered the dequoted result goes here. */
  var DequotedNameOrString: java.lang.String
  /** UTF-16 code unit index of first unprocessed character. */
  var EndPos: scala.Double
  /** Count of ignored leading whitespace, in UTF-16 code units, not Unicode code points. */
  var LeadingWhiteSpace: scala.Double
  /**
    * {@link KParseTokens} flags of first character of actual token matched. If **TokenType** is a {@link KParseType.SINGLE_QUOTE_NAME} or a {@link
    * KParseType.DOUBLE_QUOTE_STRING} the first character is the first character inside the quotes, not the quote itself.
    */
  var StartFlags: scala.Double
  /** {@link KParseType} token type like {@link KParseType.IDENTNAME} . */
  var TokenType: scala.Double
  /** Value of token in case of numeric. */
  var Value: scala.Double
}

