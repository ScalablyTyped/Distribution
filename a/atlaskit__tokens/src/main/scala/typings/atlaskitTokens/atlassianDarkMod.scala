package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.anon.AttributesFilePath
import typings.atlaskitTokens.anon.FilePathIsSource
import typings.atlaskitTokens.anon.Name
import typings.atlaskitTokens.anon.Original
import typings.atlaskitTokens.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlassianDarkMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/tokens-raw/atlassian-dark", JSImport.Default)
  @js.native
  val default: js.Array[Name | Original | Path | AttributesFilePath | FilePathIsSource] = js.native
  
  type _To = js.Array[Name | Original | Path | AttributesFilePath | FilePathIsSource]
  
  /* This means you don't have to write `default`, but can instead just say `atlassianDarkMod.foo` */
  override def _to: js.Array[Name | Original | Path | AttributesFilePath | FilePathIsSource] = default
}
