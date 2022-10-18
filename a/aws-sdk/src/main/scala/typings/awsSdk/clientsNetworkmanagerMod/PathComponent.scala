package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathComponent extends StObject {
  
  /**
    * The destination CIDR block in the route table.
    */
  var DestinationCidrBlock: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The resource.
    */
  var Resource: js.UndefOr[NetworkResourceSummary] = js.undefined
  
  /**
    * The sequence number in the path. The destination is 0.
    */
  var Sequence: js.UndefOr[Integer] = js.undefined
}
object PathComponent {
  
  inline def apply(): PathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathComponent]
  }
  
  extension [Self <: PathComponent](x: Self) {
    
    inline def setDestinationCidrBlock(value: ConstrainedString): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setResource(value: NetworkResourceSummary): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setSequence(value: Integer): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "Sequence", js.undefined)
  }
}
