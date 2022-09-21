package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagebackground extends StObject {
  
  var page_background: String
  
  var primary: String
}
object Pagebackground {
  
  inline def apply(page_background: String, primary: String): Pagebackground = {
    val __obj = js.Dynamic.literal(page_background = page_background.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagebackground]
  }
  
  extension [Self <: Pagebackground](x: Self) {
    
    inline def setPage_background(value: String): Self = StObject.set(x, "page_background", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
  }
}
