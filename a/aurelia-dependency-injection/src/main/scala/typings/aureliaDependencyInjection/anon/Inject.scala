package typings.aureliaDependencyInjection.anon

import typings.aureliaDependencyInjection.mod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inject[TArgs /* <: Args[TBase] */, TBase] extends js.Object {
  var inject: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ] = js.undefined
}

object Inject {
  @scala.inline
  def apply[/* <: typings.aureliaDependencyInjection.mod.Args[TBase] */ TArgs, TBase](
    inject: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ] = null
  ): Inject[TArgs, TBase] = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inject[TArgs, TBase]]
  }
}

