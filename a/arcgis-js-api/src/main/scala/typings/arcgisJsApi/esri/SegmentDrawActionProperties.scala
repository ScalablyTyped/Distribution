package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDrawActionProperties
  extends StObject
     with DrawActionProperties {
  
  /**
    * The drawing mode.
    *
    * @default freehand
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    */
  var mode: js.UndefOr[freehand | click] = js.undefined
}
object SegmentDrawActionProperties {
  
  inline def apply(): SegmentDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDrawActionProperties]
  }
  
  extension [Self <: SegmentDrawActionProperties](x: Self) {
    
    inline def setMode(value: freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
