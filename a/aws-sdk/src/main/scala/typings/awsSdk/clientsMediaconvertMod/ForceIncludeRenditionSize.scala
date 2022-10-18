package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceIncludeRenditionSize extends StObject {
  
  /**
    * Use Height to define the video resolution height, in pixels, for this rule.
    */
  var Height: js.UndefOr[integerMin32Max8192] = js.undefined
  
  /**
    * Use Width to define the video resolution width, in pixels, for this rule.
    */
  var Width: js.UndefOr[integerMin32Max8192] = js.undefined
}
object ForceIncludeRenditionSize {
  
  inline def apply(): ForceIncludeRenditionSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceIncludeRenditionSize]
  }
  
  extension [Self <: ForceIncludeRenditionSize](x: Self) {
    
    inline def setHeight(value: integerMin32Max8192): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setWidth(value: integerMin32Max8192): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
