package typings.amapDashJsDashApiDashArrivalDashRange

import typings.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapDashJsDashApiDashArrivalDashRangeStrings {
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait coverage extends js.Object
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait polygon extends js.Object
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def coverage: coverage = "coverage".asInstanceOf[coverage]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  @scala.inline
  def polygon: polygon = "polygon".asInstanceOf[polygon]
}

