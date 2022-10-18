package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SiteLayerInfo
import typings.arcgisJsApi.esri.SiteLayerInfoConstructor
import typings.arcgisJsApi.esri.SiteLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportSiteLayerInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/SiteLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SiteLayerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SiteLayerInfo", JSImport.Namespace)
  @js.native
  /**
    * The SiteLayerInfo class describes the boundaries of managed sites and is used for visualizing groups of facilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html)
    */
  open class Class ()
    extends StObject
       with SiteLayerInfo {
    def this(properties: SiteLayerInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SiteLayerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportSiteLayerInfoMod.foo` */
  override def _to: js.Object & SiteLayerInfoConstructor = ^
}
