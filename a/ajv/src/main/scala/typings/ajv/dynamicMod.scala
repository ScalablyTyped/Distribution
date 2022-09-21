package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.Vocabulary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/dynamic", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `dynamicMod.foo` */
  override def _to: Vocabulary = default
}
