package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDimensionRequest extends StObject {
  
  /**
    * The unique identifier for the dimension.
    */
  var name: DimensionName
}
object DescribeDimensionRequest {
  
  inline def apply(name: DimensionName): DescribeDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDimensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDimensionRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
