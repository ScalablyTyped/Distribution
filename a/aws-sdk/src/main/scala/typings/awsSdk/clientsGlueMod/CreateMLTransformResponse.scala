package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMLTransformResponse extends StObject {
  
  /**
    * A unique identifier that is generated for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}
object CreateMLTransformResponse {
  
  inline def apply(): CreateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMLTransformResponse]
  }
  
  extension [Self <: CreateMLTransformResponse](x: Self) {
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
    
    inline def setTransformIdUndefined: Self = StObject.set(x, "TransformId", js.undefined)
  }
}
