package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackConvert extends js.Object {
  def convert(
    $el: stdLib.HTMLElement,
    schema: apostropheLib.apostropheMod.apostropheNs.Schema,
    data: js.Any,
    options: js.Any
  ): js.Any = js.native
  def convert(
    $el: stdLib.HTMLElement,
    schema: apostropheLib.apostropheMod.apostropheNs.Schema,
    data: js.Any,
    options: js.Any,
    callback: js.Function0[_]
  ): js.Any = js.native
  def newInstance(schema: apostropheLib.apostropheMod.apostropheNs.Schema): js.Any = js.native
  def populate(data: js.Any, name: java.lang.String, $field: js.Any): js.Any = js.native
  def populate(data: js.Any, name: java.lang.String, $field: js.Any, callback: js.Function0[scala.Unit]): js.Any = js.native
  def populate(
    data: js.Any,
    name: java.lang.String,
    $field: js.Any,
    callback: js.Function0[scala.Unit],
    $el: stdLib.HTMLElement
  ): js.Any = js.native
  def populate(
    data: js.Any,
    name: java.lang.String,
    $field: js.Any,
    callback: js.Function0[scala.Unit],
    $el: stdLib.HTMLElement,
    field: js.Any
  ): js.Any = js.native
  def returnToError(
    $el: stdLib.HTMLElement,
    schema: apostropheLib.apostropheMod.apostropheNs.Schema,
    errorPath: js.Any,
    error: js.Any,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

