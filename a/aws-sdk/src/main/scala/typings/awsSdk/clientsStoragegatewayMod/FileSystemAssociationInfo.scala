package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemAssociationInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for the audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.AuditDestinationARN] = js.undefined
  
  var CacheAttributes: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * Specifies network configuration information for the gateway associated with the Amazon FSx file system.  If multiple file systems are associated with this gateway, this parameter's IpAddresses field is required. 
    */
  var EndpointNetworkConfiguration: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.EndpointNetworkConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the file system association.
    */
  var FileSystemAssociationARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationARN] = js.undefined
  
  /**
    * The status of the file system association. Valid Values: AVAILABLE | CREATING | DELETING | FORCE_DELETING | UPDATING | ERROR 
    */
  var FileSystemAssociationStatus: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationStatus] = js.undefined
  
  /**
    * An array containing the FileSystemAssociationStatusDetail data type, which provides detailed information on file system association status.
    */
  var FileSystemAssociationStatusDetails: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationStatusDetails] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The ARN of the backend Amazon FSx file system used for storing file data. For information, see FileSystem in the Amazon FSx API Reference.
    */
  var LocationARN: js.UndefOr[FileSystemLocationARN] = js.undefined
  
  /**
    * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.Tags] = js.undefined
}
object FileSystemAssociationInfo {
  
  inline def apply(): FileSystemAssociationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemAssociationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemAssociationInfo] (val x: Self) extends AnyVal {
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setEndpointNetworkConfiguration(value: EndpointNetworkConfiguration): Self = StObject.set(x, "EndpointNetworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointNetworkConfigurationUndefined: Self = StObject.set(x, "EndpointNetworkConfiguration", js.undefined)
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNUndefined: Self = StObject.set(x, "FileSystemAssociationARN", js.undefined)
    
    inline def setFileSystemAssociationStatus(value: FileSystemAssociationStatus): Self = StObject.set(x, "FileSystemAssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationStatusDetails(value: FileSystemAssociationStatusDetails): Self = StObject.set(x, "FileSystemAssociationStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationStatusDetailsUndefined: Self = StObject.set(x, "FileSystemAssociationStatusDetails", js.undefined)
    
    inline def setFileSystemAssociationStatusDetailsVarargs(value: FileSystemAssociationStatusDetail*): Self = StObject.set(x, "FileSystemAssociationStatusDetails", js.Array(value*))
    
    inline def setFileSystemAssociationStatusUndefined: Self = StObject.set(x, "FileSystemAssociationStatus", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setLocationARN(value: FileSystemLocationARN): Self = StObject.set(x, "LocationARN", value.asInstanceOf[js.Any])
    
    inline def setLocationARNUndefined: Self = StObject.set(x, "LocationARN", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
