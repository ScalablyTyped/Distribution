package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePrimaryRegionRequest extends StObject {
  
  /**
    * Identifies the current primary key. When the operation completes, this KMS key will be a replica key. Specify the key ID or key ARN of a multi-Region primary key. For example:   Key ID: mrk-1234abcd12ab34cd56ef1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The Amazon Web Services Region of the new primary key. Enter the Region ID, such as us-east-1 or ap-southeast-2. There must be an existing replica key in this Region.  When the operation completes, the multi-Region key in this Region will be the primary key.
    */
  var PrimaryRegion: RegionType
}
object UpdatePrimaryRegionRequest {
  
  inline def apply(KeyId: KeyIdType, PrimaryRegion: RegionType): UpdatePrimaryRegionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PrimaryRegion = PrimaryRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrimaryRegionRequest]
  }
  
  extension [Self <: UpdatePrimaryRegionRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegion(value: RegionType): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
  }
}
