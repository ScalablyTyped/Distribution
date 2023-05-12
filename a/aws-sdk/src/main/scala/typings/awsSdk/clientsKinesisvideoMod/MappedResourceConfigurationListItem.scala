package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappedResourceConfigurationListItem extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis Video Stream resource, associated with the stream.
    */
  var ARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The type of the associated resource for the kinesis video stream.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.Type] = js.undefined
}
object MappedResourceConfigurationListItem {
  
  inline def apply(): MappedResourceConfigurationListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappedResourceConfigurationListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappedResourceConfigurationListItem] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ResourceARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
