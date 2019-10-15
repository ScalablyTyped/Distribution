package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapToggleToggleEvent extends js.Object {
  var current: Basemap
  var previous: Basemap
}

object BasemapToggleToggleEvent {
  @scala.inline
  def apply(current: Basemap, previous: Basemap): BasemapToggleToggleEvent = {
    val __obj = js.Dynamic.literal(current = current, previous = previous)
  
    __obj.asInstanceOf[BasemapToggleToggleEvent]
  }
}

