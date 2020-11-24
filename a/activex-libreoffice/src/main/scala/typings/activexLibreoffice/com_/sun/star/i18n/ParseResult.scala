package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parser results returned by {@link XCharacterClassification.parseAnyToken()} and {@link XCharacterClassification.parsePredefinedToken()} . */
@js.native
trait ParseResult extends js.Object {
  
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
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    
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
    def setCharLen(value: Double): Self = this.set("CharLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContFlags(value: Double): Self = this.set("ContFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDequotedNameOrString(value: String): Self = this.set("DequotedNameOrString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPos(value: Double): Self = this.set("EndPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingWhiteSpace(value: Double): Self = this.set("LeadingWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFlags(value: Double): Self = this.set("StartFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: Double): Self = this.set("TokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
