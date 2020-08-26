package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSelectResultEvent extends js.Object {
  var result: SearchSelectResultEventResult = js.native
  var source: js.Any = js.native
  var sourceIndex: Double = js.native
}

object SearchSelectResultEvent {
  @scala.inline
  def apply(result: SearchSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSelectResultEvent]
  }
  @scala.inline
  implicit class SearchSelectResultEventOps[Self <: SearchSelectResultEvent] (val x: Self) extends AnyVal {
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
    def setResult(value: SearchSelectResultEventResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
  }
  
}

