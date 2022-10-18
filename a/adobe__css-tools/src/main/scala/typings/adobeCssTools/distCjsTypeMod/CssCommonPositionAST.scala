package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsCssPositionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssCommonPositionAST
  extends StObject
     with CssCommonAST {
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var position: js.UndefOr[default] = js.undefined
}
object CssCommonPositionAST {
  
  inline def apply(`type`: CssTypes): CssCommonPositionAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssCommonPositionAST]
  }
  
  extension [Self <: CssCommonPositionAST](x: Self) {
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPosition(value: default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
