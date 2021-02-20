package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TileMatrixSet
import typings.arcgisJsApi.esri.TileMatrixSetConstructor
import typings.arcgisJsApi.esri.TileMatrixSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMatrixSetMod extends Shortcut {
  
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  val ^ : TileMatrixSetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  class Class () extends TileMatrixSet {
    def this(properties: TileMatrixSetProperties) = this()
  }
  
  type _To = TileMatrixSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `tileMatrixSetMod.foo` */
  override def _to: TileMatrixSetConstructor = ^
}
