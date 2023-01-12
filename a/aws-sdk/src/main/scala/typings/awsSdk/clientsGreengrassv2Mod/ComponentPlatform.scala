package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPlatform extends StObject {
  
  /**
    * A dictionary of attributes for the platform. The IoT Greengrass Core software defines the os and architecture by default. You can specify additional platform attributes for a core device when you deploy the Greengrass nucleus component. For more information, see the Greengrass nucleus component in the IoT Greengrass V2 Developer Guide.
    */
  var attributes: js.UndefOr[PlatformAttributesMap] = js.undefined
  
  /**
    * The friendly name of the platform. This name helps you identify the platform. If you omit this parameter, IoT Greengrass creates a friendly name from the os and architecture of the platform.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
}
object ComponentPlatform {
  
  inline def apply(): ComponentPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentPlatform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentPlatform] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: PlatformAttributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
