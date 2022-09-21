package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureEffectConstructor
import typings.arcgisJsApi.esri.FeatureEffectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureEffectMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureEffectConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  /**
    * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html)
    */
  open class Class ()
    extends StObject
       with FeatureEffect {
    def this(properties: FeatureEffectProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureEffectConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureEffectMod.foo` */
  override def _to: js.Object & FeatureEffectConstructor = ^
}
