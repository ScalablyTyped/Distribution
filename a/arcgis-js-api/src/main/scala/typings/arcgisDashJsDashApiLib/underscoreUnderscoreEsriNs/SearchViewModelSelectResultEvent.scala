package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSelectResultEvent extends js.Object {
  var result: SearchViewModelSelectResultEventResult
  var source: js.Any
  var sourceIndex: scala.Double
}

object SearchViewModelSelectResultEvent {
  @scala.inline
  def apply(result: SearchViewModelSelectResultEventResult, source: js.Any, sourceIndex: scala.Double): SearchViewModelSelectResultEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("sourceIndex")(sourceIndex)
    __obj.asInstanceOf[SearchViewModelSelectResultEvent]
  }
}

