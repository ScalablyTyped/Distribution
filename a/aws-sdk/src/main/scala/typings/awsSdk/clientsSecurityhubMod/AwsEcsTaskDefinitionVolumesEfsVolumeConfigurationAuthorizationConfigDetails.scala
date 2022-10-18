package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails extends StObject {
  
  /**
    * The Amazon EFS access point identifier to use.
    */
  var AccessPointId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system.
    */
  var Iam: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails {
  
  inline def apply(): AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails](x: Self) {
    
    inline def setAccessPointId(value: NonEmptyString): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    inline def setIam(value: NonEmptyString): Self = StObject.set(x, "Iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "Iam", js.undefined)
  }
}
