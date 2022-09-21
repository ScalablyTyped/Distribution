package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureReductionBinning
import typings.arcgisJsApi.esri.FeatureReductionBinningConstructor
import typings.arcgisJsApi.esri.FeatureReductionBinningProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureReductionBinningMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureReductionBinning", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureReductionBinningConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureReductionBinning", JSImport.Namespace)
  @js.native
  /**
    * This class configures binning as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html), or [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html)
    */
  open class Class ()
    extends StObject
       with FeatureReductionBinning {
    def this(properties: FeatureReductionBinningProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureReductionBinningConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureReductionBinningMod.foo` */
  override def _to: js.Object & FeatureReductionBinningConstructor = ^
}
