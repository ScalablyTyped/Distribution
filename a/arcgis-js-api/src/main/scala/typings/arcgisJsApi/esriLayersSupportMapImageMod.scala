package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MapImage
import typings.arcgisJsApi.esri.MapImageConstructor
import typings.arcgisJsApi.esri.MapImageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportMapImageMod extends Shortcut {
  
  @JSImport("esri/layers/support/MapImage", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MapImageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/MapImage", JSImport.Namespace)
  @js.native
  /**
    * Represents the data object for the dynamically generated map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html)
    */
  open class Class ()
    extends StObject
       with MapImage {
    def this(properties: MapImageProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MapImageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportMapImageMod.foo` */
  override def _to: js.Object & MapImageConstructor = ^
}
