package typings.ajvKeywords

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.FuncKeywordDefinition
import typings.ajvKeywords.anon.CONSTRUCTORS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceofMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/instanceof", JSImport.Default)
  @js.native
  val default: js.Function0[FuncKeywordDefinition] & CONSTRUCTORS = js.native
  
  type Constructor = Instantiable1[/* args (repeated) */ Any, Any]
  
  type _To = js.Function0[FuncKeywordDefinition] & CONSTRUCTORS
  
  /* This means you don't have to write `default`, but can instead just say `instanceofMod.foo` */
  override def _to: js.Function0[FuncKeywordDefinition] & CONSTRUCTORS = default
}
