package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCookie extends StObject {
  
  val lCookie: Double
}
object LCookie {
  
  @scala.inline
  def apply(lCookie: Double): LCookie = {
    val __obj = js.Dynamic.literal(lCookie = lCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCookie]
  }
  
  @scala.inline
  implicit class LCookieMutableBuilder[Self <: LCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLCookie(value: Double): Self = StObject.set(x, "lCookie", value.asInstanceOf[js.Any])
  }
}
