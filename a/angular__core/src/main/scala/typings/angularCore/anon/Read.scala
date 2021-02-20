package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends StObject {
  
  var read: js.UndefOr[js.Any] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
}
object Read {
  
  @scala.inline
  def apply(): Read = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read]
  }
  
  @scala.inline
  implicit class ReadMutableBuilder[Self <: Read] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
