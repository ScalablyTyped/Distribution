package typings.aureliaDependencyInjection

import typings.aureliaDependencyInjection.mod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInject[TArgs /* <: Args[TBase] */, TBase] extends js.Object {
  var inject: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ] = js.undefined
}

object AnonInject {
  @scala.inline
  def apply[TArgs /* <: Args[TBase] */, TBase](
    inject: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ] = null
  ): AnonInject[TArgs, TBase] = {
    val __obj = js.Dynamic.literal()
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInject[TArgs, TBase]]
  }
}

