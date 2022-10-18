package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TopFeaturesQuery
import typings.arcgisJsApi.esri.TopFeaturesQueryConstructor
import typings.arcgisJsApi.esri.TopFeaturesQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportTopFeaturesQueryMod extends Shortcut {
  
  @JSImport("esri/rest/support/TopFeaturesQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TopFeaturesQueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/TopFeaturesQuery", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing [top features queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryTopFeatures) from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html)
    */
  open class Class ()
    extends StObject
       with TopFeaturesQuery {
    def this(properties: TopFeaturesQueryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TopFeaturesQueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportTopFeaturesQueryMod.foo` */
  override def _to: js.Object & TopFeaturesQueryConstructor = ^
}
