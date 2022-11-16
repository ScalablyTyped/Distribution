package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureEffectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureEffect")
@js.native
/**
  * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html)
  */
open class FeatureEffect ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureEffect {
  def this(properties: FeatureEffectProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FeatureEffect {
  
  @JSGlobal("__esri.FeatureEffect")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FeatureEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FeatureEffect]
}
