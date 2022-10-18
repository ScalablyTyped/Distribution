package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureType
import typings.arcgisJsApi.esri.FeatureTypeConstructor
import typings.arcgisJsApi.esri.FeatureTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportFeatureTypeMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureType", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTypeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureType", JSImport.Namespace)
  @js.native
  /**
    * FeatureType is a subset of features defined in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that share the same attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html)
    */
  open class Class ()
    extends StObject
       with FeatureType {
    def this(properties: FeatureTypeProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureTypeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportFeatureTypeMod.foo` */
  override def _to: js.Object & FeatureTypeConstructor = ^
}
