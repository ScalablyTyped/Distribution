package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SynthesizeAssociationGeometriesParameters")
@js.native
/**
		 * This class describes the parameters required to execute the synthesizeAssociationGeometries function which synthesizes and returns the associations geometries in a given extent.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html)
		 */
open class SynthesizeAssociationGeometriesParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParameters {
  def this(properties: SynthesizeAssociationGeometriesParametersProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SynthesizeAssociationGeometriesParameters {
  
  @JSGlobal("__esri.SynthesizeAssociationGeometriesParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParameters]
}
