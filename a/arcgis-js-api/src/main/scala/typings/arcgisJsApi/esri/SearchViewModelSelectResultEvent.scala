package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSelectResultEvent extends js.Object {
  var result: SearchViewModelSelectResultEventResult
  var source: js.Any
  var sourceIndex: Double
}

object SearchViewModelSelectResultEvent {
  @scala.inline
  def apply(result: SearchViewModelSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchViewModelSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchViewModelSelectResultEvent]
  }
}

