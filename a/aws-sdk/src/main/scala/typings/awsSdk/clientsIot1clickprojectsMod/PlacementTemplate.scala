package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementTemplate extends StObject {
  
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.undefined
  
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.undefined
}
object PlacementTemplate {
  
  inline def apply(): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTemplate]
  }
  
  extension [Self <: PlacementTemplate](x: Self) {
    
    inline def setDefaultAttributes(value: DefaultPlacementAttributeMap): Self = StObject.set(x, "defaultAttributes", value.asInstanceOf[js.Any])
    
    inline def setDefaultAttributesUndefined: Self = StObject.set(x, "defaultAttributes", js.undefined)
    
    inline def setDeviceTemplates(value: DeviceTemplateMap): Self = StObject.set(x, "deviceTemplates", value.asInstanceOf[js.Any])
    
    inline def setDeviceTemplatesUndefined: Self = StObject.set(x, "deviceTemplates", js.undefined)
  }
}
