package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformArray extends StObject {
  
  var transform: js.Array[Rotate] = js.native
}
object TransformArray {
  
  @scala.inline
  def apply(transform: js.Array[Rotate]): TransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArray]
  }
  
  @scala.inline
  implicit class TransformArrayMutableBuilder[Self <: TransformArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: js.Array[Rotate]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformVarargs(value: Rotate*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
