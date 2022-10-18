package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionAccessPointPolicyDocument extends StObject {
  
  /**
    * The last established policy for the Multi-Region Access Point.
    */
  var Established: js.UndefOr[EstablishedMultiRegionAccessPointPolicy] = js.undefined
  
  /**
    * The proposed policy for the Multi-Region Access Point.
    */
  var Proposed: js.UndefOr[ProposedMultiRegionAccessPointPolicy] = js.undefined
}
object MultiRegionAccessPointPolicyDocument {
  
  inline def apply(): MultiRegionAccessPointPolicyDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionAccessPointPolicyDocument]
  }
  
  extension [Self <: MultiRegionAccessPointPolicyDocument](x: Self) {
    
    inline def setEstablished(value: EstablishedMultiRegionAccessPointPolicy): Self = StObject.set(x, "Established", value.asInstanceOf[js.Any])
    
    inline def setEstablishedUndefined: Self = StObject.set(x, "Established", js.undefined)
    
    inline def setProposed(value: ProposedMultiRegionAccessPointPolicy): Self = StObject.set(x, "Proposed", value.asInstanceOf[js.Any])
    
    inline def setProposedUndefined: Self = StObject.set(x, "Proposed", js.undefined)
  }
}
