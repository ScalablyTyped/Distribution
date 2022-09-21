package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.customMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssCustomMediaAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var media: String
  
  var name: String
  
  @JSName("type")
  var type_CssCustomMediaAST: customMedia
}
object CssCustomMediaAST {
  
  inline def apply(media: String, name: String, `type`: customMedia): CssCustomMediaAST = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssCustomMediaAST]
  }
  
  extension [Self <: CssCustomMediaAST](x: Self) {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: customMedia): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
