package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotate extends StObject {
  
  var rotate: String = js.native
}
object Rotate {
  
  @scala.inline
  def apply(rotate: String): Rotate = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotate]
  }
  
  @scala.inline
  implicit class RotateMutableBuilder[Self <: Rotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
