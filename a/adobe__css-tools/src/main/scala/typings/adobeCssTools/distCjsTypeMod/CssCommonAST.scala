package typings.adobeCssTools.distCjsTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssCommonAST extends StObject {
  
  var `type`: CssTypes
}
object CssCommonAST {
  
  inline def apply(`type`: CssTypes): CssCommonAST = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssCommonAST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssCommonAST] (val x: Self) extends AnyVal {
    
    inline def setType(value: CssTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
