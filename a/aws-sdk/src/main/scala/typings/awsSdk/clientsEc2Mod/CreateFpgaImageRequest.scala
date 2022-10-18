package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFpgaImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
    */
  var InputStorageLocation: StorageLocation
  
  /**
    * The location in Amazon S3 for the output logs.
    */
  var LogsStorageLocation: js.UndefOr[StorageLocation] = js.undefined
  
  /**
    * A name for the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the FPGA image during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateFpgaImageRequest {
  
  inline def apply(InputStorageLocation: StorageLocation): CreateFpgaImageRequest = {
    val __obj = js.Dynamic.literal(InputStorageLocation = InputStorageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFpgaImageRequest]
  }
  
  extension [Self <: CreateFpgaImageRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInputStorageLocation(value: StorageLocation): Self = StObject.set(x, "InputStorageLocation", value.asInstanceOf[js.Any])
    
    inline def setLogsStorageLocation(value: StorageLocation): Self = StObject.set(x, "LogsStorageLocation", value.asInstanceOf[js.Any])
    
    inline def setLogsStorageLocationUndefined: Self = StObject.set(x, "LogsStorageLocation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
