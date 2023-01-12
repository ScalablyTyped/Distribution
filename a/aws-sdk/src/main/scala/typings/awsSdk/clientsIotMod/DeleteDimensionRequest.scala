package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionRequest extends StObject {
  
  /**
    * The unique identifier for the dimension that you want to delete.
    */
  var name: DimensionName
}
object DeleteDimensionRequest {
  
  inline def apply(name: DimensionName): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDimensionRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
