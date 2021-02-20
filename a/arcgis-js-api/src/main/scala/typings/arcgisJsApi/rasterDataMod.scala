package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterData
import typings.arcgisJsApi.esri.RasterDataConstructor
import typings.arcgisJsApi.esri.RasterDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterDataMod extends Shortcut {
  
  @JSImport("esri/tasks/support/RasterData", JSImport.Namespace)
  @js.native
  val ^ : RasterDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/RasterData", JSImport.Namespace)
  @js.native
  class Class () extends RasterData {
    def this(properties: RasterDataProperties) = this()
  }
  
  type _To = RasterDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterDataMod.foo` */
  override def _to: RasterDataConstructor = ^
}
