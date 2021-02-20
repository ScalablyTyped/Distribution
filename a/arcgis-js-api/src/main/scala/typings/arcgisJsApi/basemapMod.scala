package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Basemap
import typings.arcgisJsApi.esri.BasemapConstructor
import typings.arcgisJsApi.esri.BasemapProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapMod extends Shortcut {
  
  @JSImport("esri/Basemap", JSImport.Namespace)
  @js.native
  val ^ : BasemapConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Basemap", JSImport.Namespace)
  @js.native
  /**
    * Creates a new basemap object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
    */
  class Class () extends Basemap {
    def this(properties: BasemapProperties) = this()
  }
  
  type _To = BasemapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapMod.foo` */
  override def _to: BasemapConstructor = ^
}
