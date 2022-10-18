package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LevelLayerInfo
import typings.arcgisJsApi.esri.LevelLayerInfoConstructor
import typings.arcgisJsApi.esri.LevelLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportLevelLayerInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/LevelLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LevelLayerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LevelLayerInfo", JSImport.Namespace)
  @js.native
  /**
    * The LevelLayerInfo class describes the footprint of each occupiable floor contained in a managed facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html)
    */
  open class Class ()
    extends StObject
       with LevelLayerInfo {
    def this(properties: LevelLayerInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LevelLayerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportLevelLayerInfoMod.foo` */
  override def _to: js.Object & LevelLayerInfoConstructor = ^
}
