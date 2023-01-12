package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMLTransformRequest extends StObject {
  
  /**
    * The unique identifier of the transform to delete.
    */
  var TransformId: HashString
}
object DeleteMLTransformRequest {
  
  inline def apply(TransformId: HashString): DeleteMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMLTransformRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMLTransformRequest] (val x: Self) extends AnyVal {
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
