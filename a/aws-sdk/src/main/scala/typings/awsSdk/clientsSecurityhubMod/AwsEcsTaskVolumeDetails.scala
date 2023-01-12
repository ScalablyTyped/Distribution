package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskVolumeDetails extends StObject {
  
  /**
    * This parameter is specified when you use bind mount host volumes. The contents of the host parameter determine whether your bind mount host volume persists on the host container instance and where it's stored. 
    */
  var Host: js.UndefOr[AwsEcsTaskVolumeHostDetails] = js.undefined
  
  /**
    * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskVolumeDetails {
  
  inline def apply(): AwsEcsTaskVolumeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskVolumeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskVolumeDetails] (val x: Self) extends AnyVal {
    
    inline def setHost(value: AwsEcsTaskVolumeHostDetails): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
