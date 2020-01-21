package typings.angularUiTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularUITree {
  type IAcceptCallback = js.Function3[
    /* source */ typings.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destination */ typings.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destinationIndex */ scala.Double, 
    scala.Boolean
  ]
  type IDroppedCallback = js.Function1[/* eventInfo */ typings.angularUiTree.AngularUITree.IEventInfo, scala.Unit]
}
