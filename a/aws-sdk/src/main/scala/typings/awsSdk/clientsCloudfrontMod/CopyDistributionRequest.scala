package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDistributionRequest extends StObject {
  
  /**
    * A value that uniquely identifies a request to create a resource. This helps to prevent CloudFront from creating a duplicate resource if you accidentally resubmit an identical request.
    */
  var CallerReference: String
  
  /**
    * The version identifier of the primary distribution whose configuration you are copying. This is the ETag value returned in the response to GetDistribution and GetDistributionConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the primary distribution whose configuration you are copying. To get a distribution ID, use ListDistributions.
    */
  var PrimaryDistributionId: String
  
  /**
    * The type of distribution that your primary distribution will be copied to. The only valid value is True, indicating that you are copying to a staging distribution.
    */
  var Staging: js.UndefOr[Boolean] = js.undefined
}
object CopyDistributionRequest {
  
  inline def apply(CallerReference: String, PrimaryDistributionId: String): CopyDistributionRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], PrimaryDistributionId = PrimaryDistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDistributionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyDistributionRequest] (val x: Self) extends AnyVal {
    
    inline def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setPrimaryDistributionId(value: String): Self = StObject.set(x, "PrimaryDistributionId", value.asInstanceOf[js.Any])
    
    inline def setStaging(value: Boolean): Self = StObject.set(x, "Staging", value.asInstanceOf[js.Any])
    
    inline def setStagingUndefined: Self = StObject.set(x, "Staging", js.undefined)
  }
}
