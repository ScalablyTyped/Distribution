package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryFieldsInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The name of the field that stores the feature's area, e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html#shapeAreaField)
  		 */
  val shapeAreaField: String = js.native
  
  /**
  		 * The name of the field that stores the feature's length, e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html#shapeLengthField)
  		 */
  val shapeLengthField: String = js.native
  
  /**
  		 * The units of measure for the area and length field values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html#units)
  		 */
  val units: String = js.native
}
