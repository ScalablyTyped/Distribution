package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parser results returned by {@link XCharacterClassification.parseAnyToken()} and {@link XCharacterClassification.parsePredefinedToken()} . */
@js.native
trait ParseResult extends StObject {
  
  /** Number of code points (not UTF-16 code units) of the parsed token, not including leading whitespace. */
  var CharLen: Double = js.native
  
  /** {@link KParseTokens} flags of remaining characters of actual token matched. */
  var ContFlags: Double = js.native
  
  /** If a quoted name or string is encountered the dequoted result goes here. */
  var DequotedNameOrString: String = js.native
  
  /** UTF-16 code unit index of first unprocessed character. */
  var EndPos: Double = js.native
  
  /** Count of ignored leading whitespace, in UTF-16 code units, not Unicode code points. */
  var LeadingWhiteSpace: Double = js.native
  
  /**
    * {@link KParseTokens} flags of first character of actual token matched. If **TokenType** is a {@link KParseType.SINGLE_QUOTE_NAME} or a {@link
    * KParseType.DOUBLE_QUOTE_STRING} the first character is the first character inside the quotes, not the quote itself.
    */
  var StartFlags: Double = js.native
  
  /** {@link KParseType} token type like {@link KParseType.IDENTNAME} . */
  var TokenType: Double = js.native
  
  /** Value of token in case of numeric. */
  var Value: Double = js.native
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
  
  @scala.inline
  implicit class ParseResultMutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharLen(value: Double): Self = StObject.set(x, "CharLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContFlags(value: Double): Self = StObject.set(x, "ContFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDequotedNameOrString(value: String): Self = StObject.set(x, "DequotedNameOrString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPos(value: Double): Self = StObject.set(x, "EndPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingWhiteSpace(value: Double): Self = StObject.set(x, "LeadingWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFlags(value: Double): Self = StObject.set(x, "StartFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: Double): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
