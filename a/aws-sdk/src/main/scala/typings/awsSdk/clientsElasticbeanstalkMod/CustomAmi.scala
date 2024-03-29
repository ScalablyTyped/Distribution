package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAmi extends StObject {
  
  /**
    * THe ID of the image used to create the custom AMI.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ImageId] = js.undefined
  
  /**
    * The type of virtualization used to create the custom AMI.
    */
  var VirtualizationType: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.VirtualizationType] = js.undefined
}
object CustomAmi {
  
  inline def apply(): CustomAmi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAmi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomAmi] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setVirtualizationType(value: VirtualizationType): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
