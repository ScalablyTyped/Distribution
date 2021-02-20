package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expires extends StObject {
  
  var expires: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object Expires {
  
  @scala.inline
  def apply(): Expires = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expires]
  }
  
  @scala.inline
  implicit class ExpiresMutableBuilder[Self <: Expires] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
