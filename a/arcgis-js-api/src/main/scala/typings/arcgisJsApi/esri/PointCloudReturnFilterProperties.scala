package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudReturnFilterProperties
  extends StObject
     with PointCloudFilterProperties {
  
  /**
  		 * An array of return types used to filter points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
  		 */
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.undefined
}
object PointCloudReturnFilterProperties {
  
  inline def apply(): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloudReturnFilterProperties] (val x: Self) extends AnyVal {
    
    inline def setIncludedReturns(value: js.Array[firstOfMany | last | lastOfMany | single]): Self = StObject.set(x, "includedReturns", value.asInstanceOf[js.Any])
    
    inline def setIncludedReturnsUndefined: Self = StObject.set(x, "includedReturns", js.undefined)
    
    inline def setIncludedReturnsVarargs(value: (firstOfMany | last | lastOfMany | single)*): Self = StObject.set(x, "includedReturns", js.Array(value*))
  }
}
