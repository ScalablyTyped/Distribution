package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MultidimensionalSubsetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MultidimensionalSubset")
@js.native
/**
		 * A subset of multidimensional raster data created by slicing the data along defined variables and dimensions.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html)
		 */
open class MultidimensionalSubset ()
  extends StObject
     with typings.arcgisJsApi.esri.MultidimensionalSubset {
  def this(properties: MultidimensionalSubsetProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MultidimensionalSubset {
  
  @JSGlobal("__esri.MultidimensionalSubset")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MultidimensionalSubset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MultidimensionalSubset]
}
