package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FieldElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FieldElement")
@js.native
/**
		 * A `FieldElement` form element defines how a feature layer's [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html)
		 */
open class FieldElement ()
  extends StObject
     with typings.arcgisJsApi.esri.FieldElement {
  def this(properties: FieldElementProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FieldElement {
  
  @JSGlobal("__esri.FieldElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FieldElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FieldElement]
}
