package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssDeclarationAST
  extends StObject
     with CssCommonPositionAST
     with CssAllNodesAST {
  
  var property: String
  
  @JSName("type")
  var type_CssDeclarationAST: declaration
  
  var value: String
}
object CssDeclarationAST {
  
  inline def apply(property: String, `type`: declaration, value: String): CssDeclarationAST = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssDeclarationAST]
  }
  
  extension [Self <: CssDeclarationAST](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: declaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
