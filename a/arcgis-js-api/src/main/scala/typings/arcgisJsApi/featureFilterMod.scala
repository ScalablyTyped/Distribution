package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureFilter
import typings.arcgisJsApi.esri.FeatureFilterConstructor
import typings.arcgisJsApi.esri.FeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFilterMod extends Shortcut {
  
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for setting a client-side filter on a [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html)
    */
  class Class ()
    extends StObject
       with FeatureFilter {
    def this(properties: FeatureFilterProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & FeatureFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureFilterMod.foo` */
  override def _to: js.Object & FeatureFilterConstructor = ^
}
