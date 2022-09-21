package typings.asyncValidator

import org.scalablytyped.runtime.Shortcut
import typings.asyncValidator.interfaceMod.ExecuteValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod extends Shortcut {
  
  @JSImport("async-validator/dist-types/validator/string", JSImport.Default)
  @js.native
  val default: ExecuteValidator = js.native
  
  type _To = ExecuteValidator
  
  /* This means you don't have to write `default`, but can instead just say `stringMod.foo` */
  override def _to: ExecuteValidator = default
}
