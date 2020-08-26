package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Character classification (upper, lower, digit, letter, number, ...) and generic Unicode enabled parser. */
@js.native
trait XCharacterClassification extends XInterface {
  /** Get DirectionProperty of character at position **nPos** . */
  def getCharacterDirection(aText: String, nPos: Double): Double = js.native
  def getCharacterType(aText: String, nPos: Double, aLocale: Locale): Double = js.native
  def getScript(aText: String, nPos: Double): Double = js.native
  /**
    * Get accumulated KCharacterTypes of string starting at position **nPos** of length **nCount** code points.
    * @returns A number with appropriate flags set to indicate what type of characters the string contains, each flag value being one of {@link KCharacterType}
    */
  def getStringType(aText: String, nPos: Double, nCount: Double, aLocale: Locale): Double = js.native
  def getType(aText: String, nPos: Double): Double = js.native
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
    aText: String,
    nPos: Double,
    aLocale: Locale,
    nStartCharFlags: Double,
    aUserDefinedCharactersStart: String,
    nContCharFlags: Double,
    aUserDefinedCharactersCont: String
  ): ParseResult = js.native
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
    nTokenType: Double,
    aText: String,
    nPos: Double,
    aLocale: Locale,
    nStartCharFlags: Double,
    aUserDefinedCharactersStart: String,
    nContCharFlags: Double,
    aUserDefinedCharactersCont: String
  ): ParseResult = js.native
  /** Convert upper case alpha to lower case alpha, starting at position **nPos** for **nCount** code points. */
  def toLower(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String = js.native
  /** Convert to title case, starting at position **nPos** for **nCount** code points. */
  def toTitle(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String = js.native
  /** Convert lower case alpha to upper case alpha, starting at position **nPos** for **nCount** code points. */
  def toUpper(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String = js.native
}

object XCharacterClassification {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getCharacterDirection: (String, Double) => Double,
    getCharacterType: (String, Double, Locale) => Double,
    getScript: (String, Double) => Double,
    getStringType: (String, Double, Double, Locale) => Double,
    getType: (String, Double) => Double,
    parseAnyToken: (String, Double, Locale, Double, String, Double, String) => ParseResult,
    parsePredefinedToken: (Double, String, Double, Locale, Double, String, Double, String) => ParseResult,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    toLower: (String, Double, Double, Locale) => String,
    toTitle: (String, Double, Double, Locale) => String,
    toUpper: (String, Double, Double, Locale) => String
  ): XCharacterClassification = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCharacterDirection = js.Any.fromFunction2(getCharacterDirection), getCharacterType = js.Any.fromFunction3(getCharacterType), getScript = js.Any.fromFunction2(getScript), getStringType = js.Any.fromFunction4(getStringType), getType = js.Any.fromFunction2(getType), parseAnyToken = js.Any.fromFunction7(parseAnyToken), parsePredefinedToken = js.Any.fromFunction8(parsePredefinedToken), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toLower = js.Any.fromFunction4(toLower), toTitle = js.Any.fromFunction4(toTitle), toUpper = js.Any.fromFunction4(toUpper))
    __obj.asInstanceOf[XCharacterClassification]
  }
  @scala.inline
  implicit class XCharacterClassificationOps[Self <: XCharacterClassification] (val x: Self) extends AnyVal {
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
    def setGetCharacterDirection(value: (String, Double) => Double): Self = this.set("getCharacterDirection", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCharacterType(value: (String, Double, Locale) => Double): Self = this.set("getCharacterType", js.Any.fromFunction3(value))
    @scala.inline
    def setGetScript(value: (String, Double) => Double): Self = this.set("getScript", js.Any.fromFunction2(value))
    @scala.inline
    def setGetStringType(value: (String, Double, Double, Locale) => Double): Self = this.set("getStringType", js.Any.fromFunction4(value))
    @scala.inline
    def setGetType(value: (String, Double) => Double): Self = this.set("getType", js.Any.fromFunction2(value))
    @scala.inline
    def setParseAnyToken(value: (String, Double, Locale, Double, String, Double, String) => ParseResult): Self = this.set("parseAnyToken", js.Any.fromFunction7(value))
    @scala.inline
    def setParsePredefinedToken(value: (Double, String, Double, Locale, Double, String, Double, String) => ParseResult): Self = this.set("parsePredefinedToken", js.Any.fromFunction8(value))
    @scala.inline
    def setToLower(value: (String, Double, Double, Locale) => String): Self = this.set("toLower", js.Any.fromFunction4(value))
    @scala.inline
    def setToTitle(value: (String, Double, Double, Locale) => String): Self = this.set("toTitle", js.Any.fromFunction4(value))
    @scala.inline
    def setToUpper(value: (String, Double, Double, Locale) => String): Self = this.set("toUpper", js.Any.fromFunction4(value))
  }
  
}

