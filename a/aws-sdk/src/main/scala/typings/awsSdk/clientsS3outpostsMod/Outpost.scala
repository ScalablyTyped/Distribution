package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outpost extends StObject {
  
  /**
    * The Amazon S3 capacity of the outpost in bytes.
    */
  var CapacityInBytes: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.CapacityInBytes] = js.undefined
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the outpost.
    */
  var OutpostArn: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.OutpostArn] = js.undefined
  
  /**
    * Specifies the unique identifier for the outpost.
    */
  var OutpostId: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.OutpostId] = js.undefined
  
  /**
    * Returns the Amazon Web Services account ID of the outpost owner. Useful for comparing owned versus shared outposts.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.undefined
}
object Outpost {
  
  inline def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outpost] (val x: Self) extends AnyVal {
    
    inline def setCapacityInBytes(value: CapacityInBytes): Self = StObject.set(x, "CapacityInBytes", value.asInstanceOf[js.Any])
    
    inline def setCapacityInBytesUndefined: Self = StObject.set(x, "CapacityInBytes", js.undefined)
    
    inline def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
