package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltConfig extends js.Object {
  var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
  var deserialize: js.UndefOr[
    js.Function1[/* deserializeFn */ js.Function1[/* serialData */ String, js.Object], Unit]
  ] = js.native
  var dispatcher: js.UndefOr[js.Any] = js.native
  var serialize: js.UndefOr[js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, String], Unit]] = js.native
  var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.native
}

object AltConfig {
  @scala.inline
  def apply(): AltConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AltConfig]
  }
  @scala.inline
  implicit class AltConfigOps[Self <: AltConfig] (val x: Self) extends AnyVal {
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
    def setBatchingFunction(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = this.set("batchingFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchingFunction: Self = this.set("batchingFunction", js.undefined)
    @scala.inline
    def setDeserialize(value: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object] => Unit): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    @scala.inline
    def setDispatcher(value: js.Any): Self = this.set("dispatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispatcher: Self = this.set("dispatcher", js.undefined)
    @scala.inline
    def setSerialize(value: /* serializeFn */ js.Function1[/* data */ js.Object, String] => Unit): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setStoreTransformsVarargs(value: StateTransform*): Self = this.set("storeTransforms", js.Array(value :_*))
    @scala.inline
    def setStoreTransforms(value: js.Array[StateTransform]): Self = this.set("storeTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreTransforms: Self = this.set("storeTransforms", js.undefined)
  }
  
}

