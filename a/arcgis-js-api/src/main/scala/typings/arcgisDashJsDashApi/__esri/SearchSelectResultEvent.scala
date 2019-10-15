package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSelectResultEvent extends js.Object {
  var result: SearchSelectResultEventResult
  var source: js.Any
  var sourceIndex: Double
}

object SearchSelectResultEvent {
  @scala.inline
  def apply(result: SearchSelectResultEventResult, source: js.Any, sourceIndex: Double): SearchSelectResultEvent = {
    val __obj = js.Dynamic.literal(result = result, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SearchSelectResultEvent]
  }
}

