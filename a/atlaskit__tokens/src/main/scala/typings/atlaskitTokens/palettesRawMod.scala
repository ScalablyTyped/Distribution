package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.anon.FilePath
import typings.atlaskitTokens.anon.IsSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object palettesRawMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/entry-points/palettes-raw", JSImport.Default)
  @js.native
  val default: js.Array[FilePath | IsSource] = js.native
  
  type _To = js.Array[FilePath | IsSource]
  
  /* This means you don't have to write `default`, but can instead just say `palettesRawMod.foo` */
  override def _to: js.Array[FilePath | IsSource] = default
}
