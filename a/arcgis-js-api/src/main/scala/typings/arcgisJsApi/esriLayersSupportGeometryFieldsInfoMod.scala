package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeometryFieldsInfo
import typings.arcgisJsApi.esri.GeometryFieldsInfoConstructor
import typings.arcgisJsApi.esri.GeometryFieldsInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportGeometryFieldsInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/GeometryFieldsInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeometryFieldsInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/GeometryFieldsInfo", JSImport.Namespace)
  @js.native
  /**
    * The `GeometryFieldsInfo` class returns information about the system maintained geometry information associated with a specific feature in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html)
    */
  open class Class ()
    extends StObject
       with GeometryFieldsInfo {
    def this(properties: GeometryFieldsInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GeometryFieldsInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportGeometryFieldsInfoMod.foo` */
  override def _to: js.Object & GeometryFieldsInfoConstructor = ^
}
