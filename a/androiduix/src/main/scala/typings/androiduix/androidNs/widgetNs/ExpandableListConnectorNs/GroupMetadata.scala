package typings.androiduix.androidNs.widgetNs.ExpandableListConnectorNs

import typings.androiduix.javaNs.langNs.Comparable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
@js.native
class GroupMetadata () extends Comparable[GroupMetadata] {
  var flPos: Double = js.native
  var gId: Double = js.native
  var gPos: Double = js.native
  var lastChildFlPos: Double = js.native
  /* CompleteClass */
  override def compareTo(o: GroupMetadata): Double = js.native
}

/* static members */
@JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
@js.native
object GroupMetadata extends js.Object {
  var REFRESH: Double = js.native
  def obtain(flPos: Double, lastChildFlPos: Double, gPos: Double, gId: Double): GroupMetadata = js.native
}

