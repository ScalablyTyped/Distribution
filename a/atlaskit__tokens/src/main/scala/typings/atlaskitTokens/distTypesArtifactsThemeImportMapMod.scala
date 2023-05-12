package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.anon.Default
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds_
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeOverrideIds
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArtifactsThemeImportMapMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/theme-import-map", JSImport.Default)
  @js.native
  val default: Record[ThemeIds_ | ThemeOverrideIds, js.Function0[js.Promise[Default]]] = js.native
  
  type _To = Record[ThemeIds_ | ThemeOverrideIds, js.Function0[js.Promise[Default]]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesArtifactsThemeImportMapMod.foo` */
  override def _to: Record[ThemeIds_ | ThemeOverrideIds, js.Function0[js.Promise[Default]]] = default
}
