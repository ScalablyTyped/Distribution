package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.IconBrandDanger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconColorTokenSchema[BaseToken] extends StObject {
  
  var color: IconBrandDanger[BaseToken]
}
object IconColorTokenSchema {
  
  inline def apply[BaseToken](color: IconBrandDanger[BaseToken]): IconColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconColorTokenSchema[?], BaseToken] (val x: Self & IconColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: IconBrandDanger[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
