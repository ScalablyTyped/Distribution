package typings.angularCore.mod

import typings.angularCore.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275makeDecorator")
@js.native
object ɵmakeDecorator extends js.Object {
  def apply[T](name: String): Call = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _]): Call = js.native
  def apply[T](name: String, props: js.Function1[/* repeated */ js.Any, _], parentClass: js.Any): Call = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit]
  ): Call = js.native
  def apply[T](
    name: String,
    props: js.Function1[/* repeated */ js.Any, _],
    parentClass: js.Any,
    additionalProcessing: js.Function1[/* type */ Type[T], Unit],
    typeFn: js.Function2[/* type */ Type[T], /* repeated */ js.Any, Unit]
  ): Call = js.native
}

