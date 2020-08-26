package typings.aframe.anon

import typings.aframe.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Shader> */
@js.native
trait PartialShader extends js.Object {
  var data: js.UndefOr[js.Object] = js.native
  var fragmentShader: js.UndefOr[String] = js.native
  var init: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
      ], 
      Unit
    ]
  ] = js.native
  var material: js.UndefOr[typings.three.mod.Material] = js.native
  var name: js.UndefOr[String] = js.native
  var schema: js.UndefOr[
    Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ] = js.native
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  var update: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any, 
      Unit
    ]
  ] = js.native
  var vertexShader: js.UndefOr[String] = js.native
}

object PartialShader {
  @scala.inline
  def apply(): PartialShader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShader]
  }
  @scala.inline
  implicit class PartialShaderOps[Self <: PartialShader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentShader: Self = this.set("fragmentShader", js.undefined)
    @scala.inline
    def setInit(
      value: /* data */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ] => Unit
    ): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setMaterial(value: typings.three.mod.Material): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSchema(
      value: Schema_[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]
    ): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Unit): Self = this.set("tick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any => Unit
    ): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexShader: Self = this.set("vertexShader", js.undefined)
  }
  
}

