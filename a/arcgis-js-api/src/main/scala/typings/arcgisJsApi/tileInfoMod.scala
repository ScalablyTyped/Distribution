package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TileInfo
import typings.arcgisJsApi.esri.TileInfoConstructor
import typings.arcgisJsApi.esri.TileInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/TileInfo", JSImport.Namespace)
  @js.native
  val ^ : TileInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TileInfo", JSImport.Namespace)
  @js.native
  class Class () extends TileInfo {
    def this(properties: TileInfoProperties) = this()
  }
  
  type _To = TileInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `tileInfoMod.foo` */
  override def _to: TileInfoConstructor = ^
}
