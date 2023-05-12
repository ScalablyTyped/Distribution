package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpaceResponse extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainId] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The ID of the space's profile in the Amazon Elastic File System volume.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The space's Amazon Resource Name (ARN).
    */
  var SpaceArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceArn] = js.undefined
  
  /**
    * The name of the space.
    */
  var SpaceName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceName] = js.undefined
  
  /**
    * A collection of space settings.
    */
  var SpaceSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceSettings] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[SpaceStatus] = js.undefined
}
object DescribeSpaceResponse {
  
  inline def apply(): DescribeSpaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpaceResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHomeEfsFileSystemUid(value: EfsUid): Self = StObject.set(x, "HomeEfsFileSystemUid", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemUidUndefined: Self = StObject.set(x, "HomeEfsFileSystemUid", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSpaceArn(value: SpaceArn): Self = StObject.set(x, "SpaceArn", value.asInstanceOf[js.Any])
    
    inline def setSpaceArnUndefined: Self = StObject.set(x, "SpaceArn", js.undefined)
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "SpaceName", js.undefined)
    
    inline def setSpaceSettings(value: SpaceSettings): Self = StObject.set(x, "SpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setSpaceSettingsUndefined: Self = StObject.set(x, "SpaceSettings", js.undefined)
    
    inline def setStatus(value: SpaceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
