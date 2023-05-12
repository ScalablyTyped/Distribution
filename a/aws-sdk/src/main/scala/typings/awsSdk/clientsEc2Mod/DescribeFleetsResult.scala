package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetsResult extends StObject {
  
  /**
    * Information about the EC2 Fleets.
    */
  var Fleets: js.UndefOr[FleetSet] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetsResult {
  
  inline def apply(): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetsResult] (val x: Self) extends AnyVal {
    
    inline def setFleets(value: FleetSet): Self = StObject.set(x, "Fleets", value.asInstanceOf[js.Any])
    
    inline def setFleetsUndefined: Self = StObject.set(x, "Fleets", js.undefined)
    
    inline def setFleetsVarargs(value: FleetData*): Self = StObject.set(x, "Fleets", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
