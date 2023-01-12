package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoveredResource extends StObject {
  
  /**
    * The Amazon Web Services account ID of the covered resource.
    */
  var accountId: AccountId
  
  /**
    * The ID of the covered resource.
    */
  var resourceId: ResourceId
  
  /**
    * An object that contains details about the metadata.
    */
  var resourceMetadata: js.UndefOr[ResourceScanMetadata] = js.undefined
  
  /**
    * The type of the covered resource.
    */
  var resourceType: CoverageResourceType
  
  /**
    * The status of the scan covering the resource.
    */
  var scanStatus: js.UndefOr[ScanStatus] = js.undefined
  
  /**
    * The Amazon Inspector scan type covering the resource.
    */
  var scanType: ScanType
}
object CoveredResource {
  
  inline def apply(
    accountId: AccountId,
    resourceId: ResourceId,
    resourceType: CoverageResourceType,
    scanType: ScanType
  ): CoveredResource = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoveredResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoveredResource] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceMetadata(value: ResourceScanMetadata): Self = StObject.set(x, "resourceMetadata", value.asInstanceOf[js.Any])
    
    inline def setResourceMetadataUndefined: Self = StObject.set(x, "resourceMetadata", js.undefined)
    
    inline def setResourceType(value: CoverageResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScanStatus(value: ScanStatus): Self = StObject.set(x, "scanStatus", value.asInstanceOf[js.Any])
    
    inline def setScanStatusUndefined: Self = StObject.set(x, "scanStatus", js.undefined)
    
    inline def setScanType(value: ScanType): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
  }
}
