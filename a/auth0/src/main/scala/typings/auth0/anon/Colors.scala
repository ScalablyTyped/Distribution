package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: Pagebackground
  
  var logo_url: js.UndefOr[String] = js.undefined
}
object Colors {
  
  inline def apply(colors: Pagebackground): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setColors(value: Pagebackground): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    inline def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
  }
}
