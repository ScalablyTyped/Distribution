package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Character classification (upper, lower, digit, letter, number, ...) and generic Unicode enabled parser. */
trait XCharacterClassification
  extends StObject
     with XInterface {
  
  /** Get DirectionProperty of character at position **nPos** . */
  def getCharacterDirection(aText: String, nPos: Double): Double
  
  def getCharacterType(aText: String, nPos: Double, aLocale: Locale): Double
  
  def getScript(aText: String, nPos: Double): Double
  
  /**
    * Get accumulated KCharacterTypes of string starting at position **nPos** of length **nCount** code points.
    * @returns A number with appropriate flags set to indicate what type of characters the string contains, each flag value being one of {@link KCharacterType}
    */
  def getStringType(aText: String, nPos: Double, nCount: Double, aLocale: Locale): Double
  
  def getType(aText: String, nPos: Double): Double
  
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
    nTokenType: Double,
    aText: String,
    nPos: Double,
    aLocale: Locale,
    nStartCharFlags: Double,
    aUserDefinedCharactersStart: String,
    nContCharFlags: Double,
    aUserDefinedCharactersCont: String
  ): ParseResult
  
  /** Convert upper case alpha to lower case alpha, starting at position **nPos** for **nCount** code points. */
  def toLower(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String
  
  /** Convert to title case, starting at position **nPos** for **nCount** code points. */
  def toTitle(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String
  
  /** Convert lower case alpha to upper case alpha, starting at position **nPos** for **nCount** code points. */
  def toUpper(aText: String, nPos: Double, nCount: Double, aLocale: Locale): String
}
object XCharacterClassification {
  
  inline def apply(
    acquire: () => Unit,
    getCharacterDirection: (String, Double) => Double,
    getCharacterType: (String, Double, Locale) => Double,
    getScript: (String, Double) => Double,
    getStringType: (String, Double, Double, Locale) => Double,
    getType: (String, Double) => Double,
    parseAnyToken: (String, Double, Locale, Double, String, Double, String) => ParseResult,
    parsePredefinedToken: (Double, String, Double, Locale, Double, String, Double, String) => ParseResult,
    queryInterface: `type` => Any,
    release: () => Unit,
    toLower: (String, Double, Double, Locale) => String,
    toTitle: (String, Double, Double, Locale) => String,
    toUpper: (String, Double, Double, Locale) => String
  ): XCharacterClassification = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCharacterDirection = js.Any.fromFunction2(getCharacterDirection), getCharacterType = js.Any.fromFunction3(getCharacterType), getScript = js.Any.fromFunction2(getScript), getStringType = js.Any.fromFunction4(getStringType), getType = js.Any.fromFunction2(getType), parseAnyToken = js.Any.fromFunction7(parseAnyToken), parsePredefinedToken = js.Any.fromFunction8(parsePredefinedToken), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), toLower = js.Any.fromFunction4(toLower), toTitle = js.Any.fromFunction4(toTitle), toUpper = js.Any.fromFunction4(toUpper))
    __obj.asInstanceOf[XCharacterClassification]
  }
  
  extension [Self <: XCharacterClassification](x: Self) {
    
    inline def setGetCharacterDirection(value: (String, Double) => Double): Self = StObject.set(x, "getCharacterDirection", js.Any.fromFunction2(value))
    
    inline def setGetCharacterType(value: (String, Double, Locale) => Double): Self = StObject.set(x, "getCharacterType", js.Any.fromFunction3(value))
    
    inline def setGetScript(value: (String, Double) => Double): Self = StObject.set(x, "getScript", js.Any.fromFunction2(value))
    
    inline def setGetStringType(value: (String, Double, Double, Locale) => Double): Self = StObject.set(x, "getStringType", js.Any.fromFunction4(value))
    
    inline def setGetType(value: (String, Double) => Double): Self = StObject.set(x, "getType", js.Any.fromFunction2(value))
    
    inline def setParseAnyToken(value: (String, Double, Locale, Double, String, Double, String) => ParseResult): Self = StObject.set(x, "parseAnyToken", js.Any.fromFunction7(value))
    
    inline def setParsePredefinedToken(value: (Double, String, Double, Locale, Double, String, Double, String) => ParseResult): Self = StObject.set(x, "parsePredefinedToken", js.Any.fromFunction8(value))
    
    inline def setToLower(value: (String, Double, Double, Locale) => String): Self = StObject.set(x, "toLower", js.Any.fromFunction4(value))
    
    inline def setToTitle(value: (String, Double, Double, Locale) => String): Self = StObject.set(x, "toTitle", js.Any.fromFunction4(value))
    
    inline def setToUpper(value: (String, Double, Double, Locale) => String): Self = StObject.set(x, "toUpper", js.Any.fromFunction4(value))
  }
}
