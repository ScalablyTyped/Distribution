package typings.asyncValidator

import org.scalablytyped.runtime.Shortcut
import typings.asyncValidator.interfaceMod.ExecuteValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod extends Shortcut {
  
  @JSImport("async-validator/dist-types/validator/any", JSImport.Default)
  @js.native
  val default: ExecuteValidator = js.native
  
  type _To = ExecuteValidator
  
  /* This means you don't have to write `default`, but can instead just say `anyMod.foo` */
  override def _to: ExecuteValidator = default
}
