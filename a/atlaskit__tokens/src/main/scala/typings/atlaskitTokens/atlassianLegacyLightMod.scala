package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.anon.FilePathIsSource
import typings.atlaskitTokens.anon.IsSourceName
import typings.atlaskitTokens.anon.Name
import typings.atlaskitTokens.anon.NameOriginal
import typings.atlaskitTokens.anon.Original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlassianLegacyLightMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/tokens-raw/atlassian-legacy-light", JSImport.Default)
  @js.native
  val default: js.Array[Name | Original | IsSourceName | NameOriginal | FilePathIsSource] = js.native
  
  type _To = js.Array[Name | Original | IsSourceName | NameOriginal | FilePathIsSource]
  
  /* This means you don't have to write `default`, but can instead just say `atlassianLegacyLightMod.foo` */
  override def _to: js.Array[Name | Original | IsSourceName | NameOriginal | FilePathIsSource] = default
}
