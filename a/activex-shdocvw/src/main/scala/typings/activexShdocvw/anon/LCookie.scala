package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCookie extends StObject {
  
  val lCookie: Double
}
object LCookie {
  
  inline def apply(lCookie: Double): LCookie = {
    val __obj = js.Dynamic.literal(lCookie = lCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCookie]
  }
  
  extension [Self <: LCookie](x: Self) {
    
    inline def setLCookie(value: Double): Self = StObject.set(x, "lCookie", value.asInstanceOf[js.Any])
  }
}
