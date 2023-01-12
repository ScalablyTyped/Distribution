package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPoint extends StObject {
  
  /**
    * The ARN for the access point.
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.undefined
  
  /**
    * The name or alias of the access point.
    */
  var Alias: js.UndefOr[typings.awsSdk.clientsS3controlMod.Alias] = js.undefined
  
  /**
    * The name of the bucket associated with this access point.
    */
  var Bucket: BucketName
  
  /**
    * The name of this access point.
    */
  var Name: AccessPointName
  
  /**
    * Indicates whether this access point allows access from the public internet. If VpcConfiguration is specified for this access point, then NetworkOrigin is VPC, and the access point doesn't allow access from the public internet. Otherwise, NetworkOrigin is Internet, and the access point allows access from the public internet, subject to the access point and bucket access policies.
    */
  var NetworkOrigin: typings.awsSdk.clientsS3controlMod.NetworkOrigin
  
  /**
    * The virtual private cloud (VPC) configuration for this access point, if one exists.  This element is empty if this access point is an Amazon S3 on Outposts access point that is used by other Amazon Web Services. 
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsS3controlMod.VpcConfiguration] = js.undefined
}
object AccessPoint {
  
  inline def apply(Bucket: BucketName, Name: AccessPointName, NetworkOrigin: NetworkOrigin): AccessPoint = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkOrigin = NetworkOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPoint] (val x: Self) extends AnyVal {
    
    inline def setAccessPointArn(value: S3AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkOrigin(value: NetworkOrigin): Self = StObject.set(x, "NetworkOrigin", value.asInstanceOf[js.Any])
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
