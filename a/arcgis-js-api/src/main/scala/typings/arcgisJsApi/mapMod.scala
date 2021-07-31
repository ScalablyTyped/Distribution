package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.Map
import typings.arcgisJsApi.esri.MapConstructor
import typings.arcgisJsApi.esri.MapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod extends Shortcut {
  
  @JSImport("esri/Map", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MapConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Map", JSImport.Namespace)
  @js.native
  /**
    * The Map class contains properties and methods for storing, managing, and overlaying [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) common to both 2D and 3D viewing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html)
    */
  class Class ()
    extends StObject
       with Map {
    def this(properties: MapProperties) = this()
    
    /**
      * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
      */
    /* CompleteClass */
    var tables: Collection[Layer] = js.native
  }
  
  type _To = js.Object & MapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapMod.foo` */
  override def _to: js.Object & MapConstructor = ^
}
