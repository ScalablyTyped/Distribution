package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.charset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssCharsetAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var charset: String
  
  @JSName("type")
  var type_CssCharsetAST: charset
}
object CssCharsetAST {
  
  inline def apply(charset: String, `type`: charset): CssCharsetAST = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssCharsetAST]
  }
  
  extension [Self <: CssCharsetAST](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setType(value: charset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
