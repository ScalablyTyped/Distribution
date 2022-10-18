package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameSessionPlacementInput extends StObject {
  
  /**
    * A unique identifier for a game session placement to retrieve.
    */
  var PlacementId: IdStringModel
}
object DescribeGameSessionPlacementInput {
  
  inline def apply(PlacementId: IdStringModel): DescribeGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionPlacementInput]
  }
  
  extension [Self <: DescribeGameSessionPlacementInput](x: Self) {
    
    inline def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
  }
}
