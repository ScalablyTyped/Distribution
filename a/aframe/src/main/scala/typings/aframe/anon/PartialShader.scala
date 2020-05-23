package typings.aframe.anon

import typings.aframe.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Shader> */
trait PartialShader extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var fragmentShader: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
      ], 
      Unit
    ]
  ] = js.undefined
  var material: js.UndefOr[typings.three.mod.Material] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[
    Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ] = js.undefined
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var vertexShader: js.UndefOr[String] = js.undefined
}

object PartialShader {
  @scala.inline
  def apply(
    data: js.Object = null,
    fragmentShader: String = null,
    init: /* data */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ] => Unit = null,
    material: typings.three.mod.Material = null,
    name: String = null,
    schema: Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ] = null,
    tick: (/* time */ Double, /* timeDelta */ Double) => Unit = null,
    update: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any => Unit = null,
    vertexShader: String = null
  ): PartialShader = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fragmentShader != null) __obj.updateDynamic("fragmentShader")(fragmentShader.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2(tick))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (vertexShader != null) __obj.updateDynamic("vertexShader")(vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShader]
  }
}

