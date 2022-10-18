package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMLTransformResponse extends StObject {
  
  /**
    * The unique identifier for the transform that was updated.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object UpdateMLTransformResponse {
  
  inline def apply(): UpdateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLTransformResponse]
  }
  
  extension [Self <: UpdateMLTransformResponse](x: Self) {
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    inline def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
