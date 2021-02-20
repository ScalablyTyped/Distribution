package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterInfo
import typings.arcgisJsApi.esri.RasterInfoConstructor
import typings.arcgisJsApi.esri.RasterInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  val ^ : RasterInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  class Class () extends RasterInfo {
    def this(properties: RasterInfoProperties) = this()
  }
  
  type _To = RasterInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterInfoMod.foo` */
  override def _to: RasterInfoConstructor = ^
}
