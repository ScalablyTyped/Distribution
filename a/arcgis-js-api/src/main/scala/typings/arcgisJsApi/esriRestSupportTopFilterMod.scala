package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TopFilter
import typings.arcgisJsApi.esri.TopFilterConstructor
import typings.arcgisJsApi.esri.TopFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportTopFilterMod extends Shortcut {
  
  @JSImport("esri/rest/support/TopFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TopFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/TopFilter", JSImport.Namespace)
  @js.native
  /**
    * This class defines the top filter parameters for executing top features queries for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html)
    */
  open class Class ()
    extends StObject
       with TopFilter {
    def this(properties: TopFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TopFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportTopFilterMod.foo` */
  override def _to: js.Object & TopFilterConstructor = ^
}
