package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.small
import typings.arcgisJsApi.arcgisJsApiStrings.xlarge
import typings.arcgisJsApi.arcgisJsApiStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsOwnerProperties extends StObject {
  
  /**
  		 * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
  		 */
  var breakpoints: js.UndefOr[BreakpointsOwnerBreakpoints] = js.undefined
  
  /**
  		 * A convenience property indicating the general size of the view's height.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
  		 */
  var heightBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  
  /**
  		 * A convenience property indicating the general size of the view's width.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
  		 */
  var widthBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
}
object BreakpointsOwnerProperties {
  
  inline def apply(): BreakpointsOwnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsOwnerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointsOwnerProperties] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: BreakpointsOwnerBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setHeightBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "heightBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setHeightBreakpointUndefined: Self = StObject.set(x, "heightBreakpoint", js.undefined)
    
    inline def setWidthBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "widthBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setWidthBreakpointUndefined: Self = StObject.set(x, "widthBreakpoint", js.undefined)
  }
}
