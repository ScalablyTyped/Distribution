package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderMembershipRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the folder.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the folder.
    */
  var FolderId: RestrictiveResourceId
  
  /**
    * The ID of the asset (the dashboard, analysis, or dataset).
    */
  var MemberId: RestrictiveResourceId
  
  /**
    * The type of the member, including DASHBOARD, ANALYSIS, and DATASET.
    */
  var MemberType: typings.awsSdk.clientsQuicksightMod.MemberType
}
object CreateFolderMembershipRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    FolderId: RestrictiveResourceId,
    MemberId: RestrictiveResourceId,
    MemberType: MemberType
  ): CreateFolderMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], FolderId = FolderId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], MemberType = MemberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderMembershipRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFolderMembershipRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: RestrictiveResourceId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberType(value: MemberType): Self = StObject.set(x, "MemberType", value.asInstanceOf[js.Any])
  }
}
