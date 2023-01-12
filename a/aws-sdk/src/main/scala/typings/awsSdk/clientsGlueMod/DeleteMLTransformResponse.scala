package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMLTransformResponse extends StObject {
  
  /**
    * The unique identifier of the transform that was deleted.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object DeleteMLTransformResponse {
  
  inline def apply(): DeleteMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMLTransformResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMLTransformResponse] (val x: Self) extends AnyVal {
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    inline def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
