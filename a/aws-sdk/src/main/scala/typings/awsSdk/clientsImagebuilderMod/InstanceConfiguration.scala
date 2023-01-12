package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceConfiguration extends StObject {
  
  /**
    * Defines the block devices to attach for building an instance from this Image Builder AMI.
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.undefined
  
  /**
    * The AMI ID to use as the base image for a container build and test instance. If not specified, Image Builder will use the appropriate ECS-optimized AMI as a base image.
    */
  var image: js.UndefOr[NonEmptyString] = js.undefined
}
object InstanceConfiguration {
  
  inline def apply(): InstanceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappings): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value*))
    
    inline def setImage(value: NonEmptyString): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
