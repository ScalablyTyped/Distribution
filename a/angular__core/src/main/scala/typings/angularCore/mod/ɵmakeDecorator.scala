package typings.angularCore.mod

import typings.angularCore.AnonArgsCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275makeDecorator")
@js.native
object ɵmakeDecorator extends js.Object {
  def apply[T](name: String): AnonArgsCls = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _]): AnonArgsCls = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): AnonArgsCls = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit]
  ): AnonArgsCls = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit],
    typeFn: js.Function2[/* type */ Type[T], /* repeated */ js.Any, Unit]
  ): AnonArgsCls = js.native
}

