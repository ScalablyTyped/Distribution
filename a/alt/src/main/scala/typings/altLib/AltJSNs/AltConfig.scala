package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltConfig extends js.Object {
  var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], scala.Unit]] = js.undefined
  var deserialize: js.UndefOr[
    js.Function1[
      /* deserializeFn */ js.Function1[/* serialData */ java.lang.String, js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var dispatcher: js.UndefOr[js.Any] = js.undefined
  var serialize: js.UndefOr[
    js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, java.lang.String], scala.Unit]
  ] = js.undefined
  var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.undefined
}

object AltConfig {
  @scala.inline
  def apply(
    batchingFunction: /* callback */ js.Function1[/* repeated */ js.Any, _] => scala.Unit = null,
    deserialize: /* deserializeFn */ js.Function1[/* serialData */ java.lang.String, js.Object] => scala.Unit = null,
    dispatcher: js.Any = null,
    serialize: /* serializeFn */ js.Function1[/* data */ js.Object, java.lang.String] => scala.Unit = null,
    storeTransforms: js.Array[StateTransform] = null
  ): AltConfig = {
    val __obj = js.Dynamic.literal()
    if (batchingFunction != null) __obj.updateDynamic("batchingFunction")(js.Any.fromFunction1(batchingFunction))
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(dispatcher)
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (storeTransforms != null) __obj.updateDynamic("storeTransforms")(storeTransforms)
    __obj.asInstanceOf[AltConfig]
  }
}

