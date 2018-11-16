package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shader extends js.Object {
  var data: js.Object = js.native
  var fragmentShader: java.lang.String = js.native
  var material: threeLib.threeMod.Material = js.native
  var name: java.lang.String = js.native
  var schema: Schema[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(data))) */js.Any
  ] = js.native
  var tick: js.UndefOr[js.Function2[/* time */ scala.Double, /* timeDelta */ scala.Double, scala.Unit]] = js.native
  var vertexShader: java.lang.String = js.native
  def init(): scala.Unit = js.native
  def init(
    data: /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(data))) */js.Any
  ): scala.Unit = js.native
  def update(
    oldData: /* import warning: Failed type conversion: TsTypeLookup(TsTypeThis(),Left(TsIdentSimple(data))) */js.Any
  ): scala.Unit = js.native
}

