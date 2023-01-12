package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.anon.ParsingErrors
import typings.adobeCssTools.distCjsTypeMod.CssTypes.stylesheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssStylesheetAST
  extends StObject
     with CssCommonAST
     with CssAllNodesAST {
  
  var stylesheet: ParsingErrors
  
  @JSName("type")
  var type_CssStylesheetAST: stylesheet
}
object CssStylesheetAST {
  
  inline def apply(stylesheet: ParsingErrors, `type`: stylesheet): CssStylesheetAST = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStylesheetAST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssStylesheetAST] (val x: Self) extends AnyVal {
    
    inline def setStylesheet(value: ParsingErrors): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setType(value: stylesheet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
