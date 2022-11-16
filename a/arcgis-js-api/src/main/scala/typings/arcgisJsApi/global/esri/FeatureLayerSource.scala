package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureLayerSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureLayerSource")
@js.native
/**
  * The source for a feature layer to be used as fences for Geotriggers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html)
  */
open class FeatureLayerSource ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureLayerSource {
  def this(properties: FeatureLayerSourceProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FeatureLayerSource {
  
  @JSGlobal("__esri.FeatureLayerSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FeatureLayerSource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FeatureLayerSource]
}
