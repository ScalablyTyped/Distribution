package typings.aureliaDashDependencyDashInjection

import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inject[TArgs /* <: Args[TBase] */] extends js.Object {
  var inject: js.UndefOr[
    js.Array[
      /* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ] = js.undefined
}

object Anon_Inject {
  @scala.inline
  def apply[TArgs /* <: Args[TBase] */](
    inject: js.Array[
      /* import warning: ImportType.apply Failed type conversion: TArgs[number] */ js.Any
    ] = null
  ): Anon_Inject[TArgs] = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject)
    __obj.asInstanceOf[Anon_Inject[TArgs]]
  }
}

