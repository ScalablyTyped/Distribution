package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyJobDetails extends StObject {
  
  /**
    * The data to be returned by the third party job worker.
    */
  var data: js.UndefOr[ThirdPartyJobData] = js.undefined
  
  /**
    * The identifier used to identify the job details in AWS CodePipeline.
    */
  var id: js.UndefOr[ThirdPartyJobId] = js.undefined
  
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.undefined
}
object ThirdPartyJobDetails {
  
  inline def apply(): ThirdPartyJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJobDetails]
  }
  
  extension [Self <: ThirdPartyJobDetails](x: Self) {
    
    inline def setData(value: ThirdPartyJobData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: ThirdPartyJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNonce(value: Nonce): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}
