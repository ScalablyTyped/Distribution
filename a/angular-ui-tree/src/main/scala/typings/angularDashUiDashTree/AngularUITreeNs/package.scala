package typings.angularDashUiDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularUITreeNs {
  type IAcceptCallback = js.Function3[
    /* source */ ITreeNodeScope, 
    /* destination */ ITreeNodeScope, 
    /* destinationIndex */ Double, 
    Boolean
  ]
  type IDroppedCallback = js.Function1[/* eventInfo */ IEventInfo, Unit]
}
