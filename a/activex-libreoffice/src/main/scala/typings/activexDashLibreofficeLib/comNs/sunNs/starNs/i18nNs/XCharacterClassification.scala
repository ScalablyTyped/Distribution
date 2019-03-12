package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Character classification (upper, lower, digit, letter, number, ...) and generic Unicode enabled parser. */
trait XCharacterClassification
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get DirectionProperty of character at position **nPos** . */
  def getCharacterDirection(aText: java.lang.String, nPos: scala.Double): scala.Double
  def getCharacterType(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  def getScript(aText: java.lang.String, nPos: scala.Double): scala.Double
  /**
    * Get accumulated KCharacterTypes of string starting at position **nPos** of length **nCount** code points.
    * @returns A number with appropriate flags set to indicate what type of characters the string contains, each flag value being one of {@link KCharacterType}
    */
  def getStringType(
    aText: java.lang.String,
    nPos: scala.Double,
    nCount: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  def getType(aText: java.lang.String, nPos: scala.Double): scala.Double
  /**
    * Parse a string for a token starting at position **nPos** .
    *
    * A name or identifier must match the {@link KParseTokens} criteria passed in **nStartCharFlags** and **nContCharFlags** and may additionally contain
    * characters of **aUserDefinedCharactersStart** and/or **aUserDefinedCharactersCont** .
    * @param aText Text to be parsed.
    * @param nPos Position where parsing starts.
    * @param aLocale The locale, for example, for decimal and group separator or character type determination.
    * @param nStartCharFlags A set of {@link KParseTokens} constants determining the allowed characters a name or identifier may start with.
    * @param aUserDefinedCharactersStart A set of additionally allowed characters a name or identifier may start with.
    * @param nContCharFlags A set of {@link KParseTokens} constants determining the allowed characters a name or identifier may continue with.
    * @param aUserDefinedCharactersCont A set of additionally allowed characters a name or identifier may continue with.{{program example here, see documentation}}
    * @returns A filled {@link ParseResult} structure. If no unambiguous token could be parsed, {@link ParseResult.TokenType} will be set to **0** (zero), other
    */
  def parseAnyToken(
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nStartCharFlags: scala.Double,
    aUserDefinedCharactersStart: java.lang.String,
    nContCharFlags: scala.Double,
    aUserDefinedCharactersCont: java.lang.String
  ): ParseResult
  /**
    * Parse a string for a token of type **nTokenType** starting at position **nPos** .
    *
    * Other parameters are the same as in {@link parseAnyToken()} . If the actual token does not match the passed **nTokenType** a {@link
    * ParseResult.TokenType} set to **0** (zero) is returned.
    * @param nTokenType One or more of the {@link KParseType} constants.
    * @param aText See {@link parseAnyToken}
    * @param nPos See {@link parseAnyToken}
    * @param aLocale See {@link parseAnyToken}
    * @param nStartCharFlags See {@link parseAnyToken}
    * @param aUserDefinedCharactersStart See {@link parseAnyToken}
    * @param nContCharFlags See {@link parseAnyToken}
    * @param aUserDefinedCharactersCont See {@link parseAnyToken}{{program example here, see documentation}}
    */
  def parsePredefinedToken(
    nTokenType: scala.Double,
    aText: java.lang.String,
    nPos: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nStartCharFlags: scala.Double,
    aUserDefinedCharactersStart: java.lang.String,
    nContCharFlags: scala.Double,
    aUserDefinedCharactersCont: java.lang.String
  ): ParseResult
  /** Convert upper case alpha to lower case alpha, starting at position **nPos** for **nCount** code points. */
  def toLower(
    aText: java.lang.String,
    nPos: scala.Double,
    nCount: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** Convert to title case, starting at position **nPos** for **nCount** code points. */
  def toTitle(
    aText: java.lang.String,
    nPos: scala.Double,
    nCount: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** Convert lower case alpha to upper case alpha, starting at position **nPos** for **nCount** code points. */
  def toUpper(
    aText: java.lang.String,
    nPos: scala.Double,
    nCount: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
}

object XCharacterClassification {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getCharacterDirection: (java.lang.String, scala.Double) => scala.Double,
    getCharacterType: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getScript: (java.lang.String, scala.Double) => scala.Double,
    getStringType: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getType: (java.lang.String, scala.Double) => scala.Double,
    parseAnyToken: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, java.lang.String, scala.Double, java.lang.String) => ParseResult,
    parsePredefinedToken: (scala.Double, java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, java.lang.String, scala.Double, java.lang.String) => ParseResult,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    toLower: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    toTitle: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    toUpper: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String
  ): XCharacterClassification = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCharacterDirection = js.Any.fromFunction2(getCharacterDirection), getCharacterType = js.Any.fromFunction3(getCharacterType), getScript = js.Any.fromFunction2(getScript), getStringType = js.Any.fromFunction4(getStringType), getType = js.Any.fromFunction2(getType), parseAnyToken = js.Any.fromFunction7(parseAnyToken), parsePredefinedToken = js.Any.fromFunction8(parsePredefinedToken), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toLower = js.Any.fromFunction4(toLower), toTitle = js.Any.fromFunction4(toTitle), toUpper = js.Any.fromFunction4(toUpper))
  
    __obj.asInstanceOf[XCharacterClassification]
  }
}

