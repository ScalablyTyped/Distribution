package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconBrandDanger[BaseToken] extends StObject {
  
  var icon: BrandDanger[BaseToken]
}
object IconBrandDanger {
  
  inline def apply[BaseToken](icon: BrandDanger[BaseToken]): IconBrandDanger[BaseToken] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBrandDanger[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconBrandDanger[?], BaseToken] (val x: Self & IconBrandDanger[BaseToken]) extends AnyVal {
    
    inline def setIcon(value: BrandDanger[BaseToken]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
