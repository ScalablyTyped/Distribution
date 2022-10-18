package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureReductionSelection
import typings.arcgisJsApi.esri.FeatureReductionSelectionConstructor
import typings.arcgisJsApi.esri.FeatureReductionSelectionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportFeatureReductionSelectionMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureReductionSelectionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  /**
    * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
    */
  open class Class ()
    extends StObject
       with FeatureReductionSelection {
    def this(properties: FeatureReductionSelectionProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureReductionSelectionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportFeatureReductionSelectionMod.foo` */
  override def _to: js.Object & FeatureReductionSelectionConstructor = ^
}
