package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterPackageVersionRequest extends StObject {
  
  /**
    * Whether to mark the new version as the latest version.
    */
  var MarkLatest: js.UndefOr[MarkLatestPatch] = js.undefined
  
  /**
    * An owner account.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * A package ID.
    */
  var PackageId: NodePackageId
  
  /**
    * A package version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * A patch version.
    */
  var PatchVersion: NodePackagePatchVersion
}
object RegisterPackageVersionRequest {
  
  inline def apply(
    PackageId: NodePackageId,
    PackageVersion: NodePackageVersion,
    PatchVersion: NodePackagePatchVersion
  ): RegisterPackageVersionRequest = {
    val __obj = js.Dynamic.literal(PackageId = PackageId.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterPackageVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterPackageVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setMarkLatest(value: MarkLatestPatch): Self = StObject.set(x, "MarkLatest", value.asInstanceOf[js.Any])
    
    inline def setMarkLatestUndefined: Self = StObject.set(x, "MarkLatest", js.undefined)
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
  }
}
