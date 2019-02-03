package typings
package androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
@js.native
class GroupMetadata ()
  extends androiduixLib.javaNs.langNs.Comparable[GroupMetadata] {
  var flPos: scala.Double = js.native
  var gId: scala.Double = js.native
  var gPos: scala.Double = js.native
  var lastChildFlPos: scala.Double = js.native
  /* CompleteClass */
  override def compareTo(o: GroupMetadata): scala.Double = js.native
}

/* static members */
@JSGlobal("android.widget.ExpandableListConnector.GroupMetadata")
@js.native
object GroupMetadata extends js.Object {
  var REFRESH: scala.Double = js.native
  def obtain(flPos: scala.Double, lastChildFlPos: scala.Double, gPos: scala.Double, gId: scala.Double): androiduixLib.androidNs.widgetNs.ExpandableListConnectorNs.GroupMetadata = js.native
}

