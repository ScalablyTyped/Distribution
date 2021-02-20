package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZIndex extends StObject {
  
  var zIndex: Double = js.native
}
object ZIndex {
  
  @scala.inline
  def apply(zIndex: Double): ZIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
  
  @scala.inline
  implicit class ZIndexMutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
