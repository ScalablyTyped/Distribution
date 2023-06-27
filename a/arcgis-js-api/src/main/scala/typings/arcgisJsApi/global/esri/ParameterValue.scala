package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ParameterValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ParameterValue")
@js.native
/**
		 * Represents the output parameters of a [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) method and their properties and values.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html)
		 */
open class ParameterValue ()
  extends StObject
     with typings.arcgisJsApi.esri.ParameterValue {
  def this(properties: ParameterValueProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ParameterValue {
  
  @JSGlobal("__esri.ParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ParameterValue]
}
