package typings.angularCore.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275RuntimeError")
@js.native
open class ɵRuntimeError[T /* <: Double */] protected ()
  extends StObject
     with Error {
  def this(code: T) = this()
  def this(code: T, message: false) = this()
  def this(code: T, message: String) = this()
  
  var code: T = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
