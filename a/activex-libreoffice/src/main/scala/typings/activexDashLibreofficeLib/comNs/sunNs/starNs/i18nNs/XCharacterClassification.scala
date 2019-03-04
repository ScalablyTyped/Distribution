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
    acquire: js.Function0[scala.Unit],
    getCharacterDirection: js.Function2[java.lang.String, scala.Double, scala.Double],
    getCharacterType: js.Function3[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    getScript: js.Function2[java.lang.String, scala.Double, scala.Double],
    getStringType: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double
    ],
    getType: js.Function2[java.lang.String, scala.Double, scala.Double],
    parseAnyToken: js.Function7[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      ParseResult
    ],
    parsePredefinedToken: js.Function8[
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      ParseResult
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    toLower: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    toTitle: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    toUpper: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ]
  ): XCharacterClassification = {
    val __obj = js.Dynamic.literal(acquire = acquire, getCharacterDirection = getCharacterDirection, getCharacterType = getCharacterType, getScript = getScript, getStringType = getStringType, getType = getType, parseAnyToken = parseAnyToken, parsePredefinedToken = parsePredefinedToken, queryInterface = queryInterface, release = release, toLower = toLower, toTitle = toTitle, toUpper = toUpper)
  
    __obj.asInstanceOf[XCharacterClassification]
  }
}

