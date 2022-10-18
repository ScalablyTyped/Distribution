package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPrefixListReferencesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the prefix list references.
    */
  var TransitGatewayPrefixListReferences: js.UndefOr[TransitGatewayPrefixListReferenceSet] = js.undefined
}
object GetTransitGatewayPrefixListReferencesResult {
  
  inline def apply(): GetTransitGatewayPrefixListReferencesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayPrefixListReferencesResult]
  }
  
  extension [Self <: GetTransitGatewayPrefixListReferencesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayPrefixListReferences(value: TransitGatewayPrefixListReferenceSet): Self = StObject.set(x, "TransitGatewayPrefixListReferences", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPrefixListReferencesUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReferences", js.undefined)
    
    inline def setTransitGatewayPrefixListReferencesVarargs(value: TransitGatewayPrefixListReference*): Self = StObject.set(x, "TransitGatewayPrefixListReferences", js.Array(value*))
  }
}
