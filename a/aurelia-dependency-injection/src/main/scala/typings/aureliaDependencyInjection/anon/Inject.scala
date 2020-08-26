package typings.aureliaDependencyInjection.anon

import typings.aureliaDependencyInjection.mod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inject[TArgs /* <: Args[TBase] */, TBase] extends js.Object {
  var inject: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ] = js.native
}

object Inject {
  @scala.inline
  def apply[/* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs, TBase](): Inject[TArgs, TBase] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inject[TArgs, TBase]]
  }
  @scala.inline
  implicit class InjectOps[Self <: Inject[_, _], /* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs, TBase] (val x: Self with (Inject[TArgs, TBase])) extends AnyVal {
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
    def setInjectVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
    ): Self = this.set("inject", js.Array(value :_*))
    @scala.inline
    def setInject(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]
    ): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
  }
  
}

