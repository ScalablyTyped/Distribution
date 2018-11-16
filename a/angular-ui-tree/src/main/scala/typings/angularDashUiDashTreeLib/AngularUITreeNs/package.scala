package typings
package angularDashUiDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularUITreeNs {
  type IAcceptCallback = js.Function3[
    /* source */ ITreeNodeScope, 
    /* destination */ ITreeNodeScope, 
    /* destinationIndex */ scala.Double, 
    scala.Boolean
  ]
  type IDroppedCallback = js.Function1[/* eventInfo */ IEventInfo, scala.Unit]
}
