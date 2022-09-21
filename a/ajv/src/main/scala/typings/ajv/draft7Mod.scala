package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.Vocabulary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draft7Mod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/draft7", JSImport.Default)
  @js.native
  val default: js.Array[Vocabulary] = js.native
  
  type _To = js.Array[Vocabulary]
  
  /* This means you don't have to write `default`, but can instead just say `draft7Mod.foo` */
  override def _to: js.Array[Vocabulary] = default
}
