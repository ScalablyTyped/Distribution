package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that determine map parameters used when showing items.
  */
trait MapShowItemsOptions extends StObject {
  
  /**
    * A Boolean value that determines whether the map is animated as the map
    * region changes to show the items.
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Spacing that is added around the computed map region when showing items.
    */
  var minimumSpan: js.UndefOr[CoordinateSpan] = js.undefined
  
  /**
    * The minimum longitudinal and latitudinal span the map should display.
    */
  var padding: js.UndefOr[Padding] = js.undefined
}
object MapShowItemsOptions {
  
  inline def apply(): MapShowItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapShowItemsOptions]
  }
  
  extension [Self <: MapShowItemsOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setMinimumSpan(value: CoordinateSpan): Self = StObject.set(x, "minimumSpan", value.asInstanceOf[js.Any])
    
    inline def setMinimumSpanUndefined: Self = StObject.set(x, "minimumSpan", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
