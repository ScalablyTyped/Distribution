package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Parameters extends StObject {
  
  /**
    * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
    */
  var ManifestFileLocation: typings.awsSdk.clientsQuicksightMod.ManifestFileLocation
  
  /**
    * Use the RoleArn structure to override an account-wide role for a specific S3 data source. For example, say an account administrator has turned off all S3 access with an account-wide role. The administrator can then use RoleArn to bypass the account-wide role and allow S3 access for the single S3 data source that is specified in the structure, even if the account-wide role forbidding S3 access is still active.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RoleArn] = js.undefined
}
object S3Parameters {
  
  inline def apply(ManifestFileLocation: ManifestFileLocation): S3Parameters = {
    val __obj = js.Dynamic.literal(ManifestFileLocation = ManifestFileLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Parameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Parameters] (val x: Self) extends AnyVal {
    
    inline def setManifestFileLocation(value: ManifestFileLocation): Self = StObject.set(x, "ManifestFileLocation", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
