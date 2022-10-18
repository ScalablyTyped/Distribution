package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlacementResponse extends StObject {
  
  /**
    * An object describing the placement.
    */
  var placement: PlacementDescription
}
object DescribePlacementResponse {
  
  inline def apply(placement: PlacementDescription): DescribePlacementResponse = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementResponse]
  }
  
  extension [Self <: DescribePlacementResponse](x: Self) {
    
    inline def setPlacement(value: PlacementDescription): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
