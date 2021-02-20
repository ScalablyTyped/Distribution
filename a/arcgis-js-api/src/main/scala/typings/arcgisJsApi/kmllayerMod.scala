package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.KMLLayer
import typings.arcgisJsApi.esri.KMLLayerConstructor
import typings.arcgisJsApi.esri.KMLLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmllayerMod extends Shortcut {
  
  @JSImport("esri/layers/KMLLayer", JSImport.Namespace)
  @js.native
  val ^ : KMLLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/KMLLayer", JSImport.Namespace)
  @js.native
  /**
    * The KMLLayer class is used to create a layer based on a KML file (.kml, .kmz).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html)
    */
  class Class () extends KMLLayer {
    def this(properties: KMLLayerProperties) = this()
  }
  
  type _To = KMLLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `kmllayerMod.foo` */
  override def _to: KMLLayerConstructor = ^
}
