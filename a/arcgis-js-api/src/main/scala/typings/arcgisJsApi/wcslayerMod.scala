package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WCSLayer
import typings.arcgisJsApi.esri.WCSLayerConstructor
import typings.arcgisJsApi.esri.WCSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wcslayerMod extends Shortcut {
  
  @JSImport("esri/layers/WCSLayer", JSImport.Namespace)
  @js.native
  val ^ : WCSLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/WCSLayer", JSImport.Namespace)
  @js.native
  /**
    * WCS presents raster data from a [OGC Web Coverage Service](https://www.ogc.org/standards/wcs).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html)
    */
  class Class () extends WCSLayer {
    def this(properties: WCSLayerProperties) = this()
  }
  
  type _To = WCSLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wcslayerMod.foo` */
  override def _to: WCSLayerConstructor = ^
}
