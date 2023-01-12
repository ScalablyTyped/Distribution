package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageVersionResponse extends StObject {
  
  /**
    * Whether the version is the latest available.
    */
  var IsLatestPatch: Boolean
  
  /**
    * The account ID of the version's owner.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * The ARN of the package.
    */
  var PackageArn: js.UndefOr[NodePackageArn] = js.undefined
  
  /**
    * The version's ID.
    */
  var PackageId: NodePackageId
  
  /**
    * The version's name.
    */
  var PackageName: NodePackageName
  
  /**
    * The version's version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * The version's patch version.
    */
  var PatchVersion: NodePackagePatchVersion
  
  /**
    * The version's registered time.
    */
  var RegisteredTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version's status.
    */
  var Status: PackageVersionStatus
  
  /**
    * The version's status description.
    */
  var StatusDescription: js.UndefOr[PackageVersionStatusDescription] = js.undefined
}
object DescribePackageVersionResponse {
  
  inline def apply(
    IsLatestPatch: Boolean,
    PackageId: NodePackageId,
    PackageName: NodePackageName,
    PackageVersion: NodePackageVersion,
    PatchVersion: NodePackagePatchVersion,
    Status: PackageVersionStatus
  ): DescribePackageVersionResponse = {
    val __obj = js.Dynamic.literal(IsLatestPatch = IsLatestPatch.asInstanceOf[js.Any], PackageId = PackageId.asInstanceOf[js.Any], PackageName = PackageName.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackageVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setIsLatestPatch(value: Boolean): Self = StObject.set(x, "IsLatestPatch", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageArn(value: NodePackageArn): Self = StObject.set(x, "PackageArn", value.asInstanceOf[js.Any])
    
    inline def setPackageArnUndefined: Self = StObject.set(x, "PackageArn", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
    
    inline def setRegisteredTime(value: js.Date): Self = StObject.set(x, "RegisteredTime", value.asInstanceOf[js.Any])
    
    inline def setRegisteredTimeUndefined: Self = StObject.set(x, "RegisteredTime", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDescription(value: PackageVersionStatusDescription): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
    
    inline def setStatusDescriptionUndefined: Self = StObject.set(x, "StatusDescription", js.undefined)
  }
}
