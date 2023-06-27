package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SizeVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SizeVariable")
@js.native
/**
		 * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
		 */
open class SizeVariable ()
  extends StObject
     with typings.arcgisJsApi.esri.SizeVariable {
  def this(properties: SizeVariableProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SizeVariable {
  
  @JSGlobal("__esri.SizeVariable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SizeVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SizeVariable]
}
