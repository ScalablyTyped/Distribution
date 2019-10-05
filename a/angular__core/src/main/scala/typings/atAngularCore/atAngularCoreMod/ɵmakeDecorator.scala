package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.Anon_ArgsCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ɵmakeDecorator")
@js.native
object ɵmakeDecorator extends js.Object {
  def apply[T](name: String): Anon_ArgsCls = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _]): Anon_ArgsCls = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): Anon_ArgsCls = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit]
  ): Anon_ArgsCls = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit],
    typeFn: js.Function2[/* type */ Type[T], /* repeated */ js.Any, Unit]
  ): Anon_ArgsCls = js.native
}

