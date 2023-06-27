package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100SupportedCRSs extends StObject {
  
  /**
  		 * The native coordinate reference system of a coverage – that is, the coordinate reference systems in which coverages can be obtained without any distortion or degradation of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var nativeCRSs: js.Array[String]
  
  /**
  		 * Coordinate reference systems in which the coverage can both accept GetCoverage requests and deliver coverage responses.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var requestResponseCRSs: js.Array[String]
}
object CoverageDescriptionV100SupportedCRSs {
  
  inline def apply(nativeCRSs: js.Array[String], requestResponseCRSs: js.Array[String]): CoverageDescriptionV100SupportedCRSs = {
    val __obj = js.Dynamic.literal(nativeCRSs = nativeCRSs.asInstanceOf[js.Any], requestResponseCRSs = requestResponseCRSs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100SupportedCRSs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100SupportedCRSs] (val x: Self) extends AnyVal {
    
    inline def setNativeCRSs(value: js.Array[String]): Self = StObject.set(x, "nativeCRSs", value.asInstanceOf[js.Any])
    
    inline def setNativeCRSsVarargs(value: String*): Self = StObject.set(x, "nativeCRSs", js.Array(value*))
    
    inline def setRequestResponseCRSs(value: js.Array[String]): Self = StObject.set(x, "requestResponseCRSs", value.asInstanceOf[js.Any])
    
    inline def setRequestResponseCRSsVarargs(value: String*): Self = StObject.set(x, "requestResponseCRSs", js.Array(value*))
  }
}
