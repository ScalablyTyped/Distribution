package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssNamespaceAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var namespace: String
  
  @JSName("type")
  var type_CssNamespaceAST: namespace
}
object CssNamespaceAST {
  
  inline def apply(namespace: String, `type`: namespace): CssNamespaceAST = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNamespaceAST]
  }
  
  extension [Self <: CssNamespaceAST](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: namespace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
