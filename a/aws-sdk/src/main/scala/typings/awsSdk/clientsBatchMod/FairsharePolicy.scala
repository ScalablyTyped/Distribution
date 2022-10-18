package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FairsharePolicy extends StObject {
  
  /**
    * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. The reserved ratio is (computeReservation/100)^ActiveFairShares  where  ActiveFairShares  is the number of active fair share identifiers. For example, a computeReservation value of 50 indicates that Batch should reserve 50% of the maximum available vCPU if there is only one fair share identifier, 25% if there are two fair share identifiers, and 12.5% if there are three fair share identifiers. A computeReservation value of 25 indicates that Batch should reserve 25% of the maximum available vCPU if there is only one fair share identifier, 6.25% if there are two fair share identifiers, and 1.56% if there are three fair share identifiers. The minimum value is 0 and the maximum value is 99.
    */
  var computeReservation: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time period to use to calculate a fair share percentage for each fair share identifier in use, in seconds. A value of zero (0) indicates that only current usage should be measured. The decay allows for more recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1 week).
    */
  var shareDecaySeconds: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of SharedIdentifier objects that contain the weights for the fair share identifiers for the fair share policy. Fair share identifiers that aren't included have a default weight of 1.0.
    */
  var shareDistribution: js.UndefOr[ShareAttributesList] = js.undefined
}
object FairsharePolicy {
  
  inline def apply(): FairsharePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FairsharePolicy]
  }
  
  extension [Self <: FairsharePolicy](x: Self) {
    
    inline def setComputeReservation(value: Integer): Self = StObject.set(x, "computeReservation", value.asInstanceOf[js.Any])
    
    inline def setComputeReservationUndefined: Self = StObject.set(x, "computeReservation", js.undefined)
    
    inline def setShareDecaySeconds(value: Integer): Self = StObject.set(x, "shareDecaySeconds", value.asInstanceOf[js.Any])
    
    inline def setShareDecaySecondsUndefined: Self = StObject.set(x, "shareDecaySeconds", js.undefined)
    
    inline def setShareDistribution(value: ShareAttributesList): Self = StObject.set(x, "shareDistribution", value.asInstanceOf[js.Any])
    
    inline def setShareDistributionUndefined: Self = StObject.set(x, "shareDistribution", js.undefined)
    
    inline def setShareDistributionVarargs(value: ShareAttributes*): Self = StObject.set(x, "shareDistribution", js.Array(value*))
  }
}
