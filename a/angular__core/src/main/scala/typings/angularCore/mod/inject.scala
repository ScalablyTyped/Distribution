package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "inject")
@js.native
object inject extends js.Object {
  
  def apply[T](token: InjectionToken[T]): T | Null = js.native
  def apply[T](token: InjectionToken[T], flags: InjectFlags): T | Null = js.native
  def apply[T](token: Type[T]): T | Null = js.native
  def apply[T](token: Type[T], flags: InjectFlags): T | Null = js.native
}
