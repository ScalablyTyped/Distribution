package typings.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeout extends StObject {
  
  var timeout: js.UndefOr[Double] = js.native
}
object Timeout {
  
  @scala.inline
  def apply(): Timeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeout]
  }
  
  @scala.inline
  implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
