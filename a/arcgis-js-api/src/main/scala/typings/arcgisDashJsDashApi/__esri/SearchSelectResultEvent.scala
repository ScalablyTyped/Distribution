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
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchSelectResultEvent]
  }
}

