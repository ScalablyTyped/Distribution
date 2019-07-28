package typings.aframe.aframeMod

import typings.three.threeMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  var data: js.Object = js.native
  var fragmentShader: String = js.native
  var material: Material = js.native
  var name: String = js.native
  var schema: Schema[
    /* import warning: ImportType.apply Failed type conversion: this['data'] */ js.Any
  ] = js.native
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  var vertexShader: String = js.native
  def init(): Unit = js.native
  @JSName("init")
  def init_data(data: /* import warning: ImportType.apply Failed type conversion: this['data'] */ js.Any): Unit = js.native
  @JSName("update")
  def update_data(oldData: /* import warning: ImportType.apply Failed type conversion: this['data'] */ js.Any): Unit = js.native
}

