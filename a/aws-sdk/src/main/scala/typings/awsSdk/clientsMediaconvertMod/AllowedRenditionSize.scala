package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedRenditionSize extends StObject {
  
  /**
    * Use Height to define the video resolution height, in pixels, for this rule.
    */
  var Height: js.UndefOr[integerMin32Max8192] = js.undefined
  
  /**
    * Set to ENABLED to force a rendition to be included.
    */
  var Required: js.UndefOr[RequiredFlag] = js.undefined
  
  /**
    * Use Width to define the video resolution width, in pixels, for this rule.
    */
  var Width: js.UndefOr[integerMin32Max8192] = js.undefined
}
object AllowedRenditionSize {
  
  inline def apply(): AllowedRenditionSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedRenditionSize]
  }
  
  extension [Self <: AllowedRenditionSize](x: Self) {
    
    inline def setHeight(value: integerMin32Max8192): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setRequired(value: RequiredFlag): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
    
    inline def setWidth(value: integerMin32Max8192): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
