package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inject extends js.Object {
  /**
    * A [DI token](guide/glossary#di-token) that maps to the dependency to be injected.
    */
  var token: js.Any
}

@JSImport("@angular/core", "Inject")
@js.native
object Inject extends TopLevel[InjectDecorator]

@JSImport("@angular/core", "inject")
@js.native
object inject extends js.Object {
  def apply[T](token: InjectionToken[T]): T = js.native
  def apply[T](token: InjectionToken[T], flags: InjectFlags): T | Null = js.native
  def apply[T](token: Type[T]): T = js.native
  def apply[T](token: Type[T], flags: InjectFlags): T | Null = js.native
}

