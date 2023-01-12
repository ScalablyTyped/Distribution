package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EFSAuthorizationConfig extends StObject {
  
  /**
    * The Amazon EFS access point ID to use. If an access point is specified, the root directory value specified in the EFSVolumeConfiguration must either be omitted or set to / which enforces the path set on the EFS access point. If an access point is used, transit encryption must be enabled in the EFSVolumeConfiguration. For more information, see Working with Amazon EFS access points in the Amazon Elastic File System User Guide.
    */
  var accessPointId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to use the Batch job IAM role defined in a job definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. If this parameter is omitted, the default value of DISABLED is used. For more information, see Using Amazon EFS access points in the Batch User Guide. EFS IAM authorization requires that TransitEncryption be ENABLED and that a JobRoleArn is specified.
    */
  var iam: js.UndefOr[EFSAuthorizationConfigIAM] = js.undefined
}
object EFSAuthorizationConfig {
  
  inline def apply(): EFSAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EFSAuthorizationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EFSAuthorizationConfig] (val x: Self) extends AnyVal {
    
    inline def setAccessPointId(value: String): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "accessPointId", js.undefined)
    
    inline def setIam(value: EFSAuthorizationConfigIAM): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
  }
}
