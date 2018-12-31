package typings
package angularDashUiDashTreeLib.AngularUITreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in list
  */
trait ITreeNode extends js.Object {
  var id: scala.Double | java.lang.String
  var nodes: js.Array[ITreeNode]
  var title: java.lang.String
}

