package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pathname extends StObject {
  
  var pathname: js.UndefOr[String] = js.undefined
}
object Pathname {
  
  inline def apply(): Pathname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pathname]
  }
  
  extension [Self <: Pathname](x: Self) {
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
  }
}
