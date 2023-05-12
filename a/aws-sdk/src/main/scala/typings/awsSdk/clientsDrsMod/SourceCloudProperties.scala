package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCloudProperties extends StObject {
  
  /**
    * AWS Account ID for an EC2-originated Source Server.
    */
  var originAccountID: js.UndefOr[AccountID] = js.undefined
  
  /**
    * AWS Availability Zone for an EC2-originated Source Server.
    */
  var originAvailabilityZone: js.UndefOr[AwsAvailabilityZone] = js.undefined
  
  /**
    * AWS Region for an EC2-originated Source Server.
    */
  var originRegion: js.UndefOr[AwsRegion] = js.undefined
}
object SourceCloudProperties {
  
  inline def apply(): SourceCloudProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCloudProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCloudProperties] (val x: Self) extends AnyVal {
    
    inline def setOriginAccountID(value: AccountID): Self = StObject.set(x, "originAccountID", value.asInstanceOf[js.Any])
    
    inline def setOriginAccountIDUndefined: Self = StObject.set(x, "originAccountID", js.undefined)
    
    inline def setOriginAvailabilityZone(value: AwsAvailabilityZone): Self = StObject.set(x, "originAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setOriginAvailabilityZoneUndefined: Self = StObject.set(x, "originAvailabilityZone", js.undefined)
    
    inline def setOriginRegion(value: AwsRegion): Self = StObject.set(x, "originRegion", value.asInstanceOf[js.Any])
    
    inline def setOriginRegionUndefined: Self = StObject.set(x, "originRegion", js.undefined)
  }
}
