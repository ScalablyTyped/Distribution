package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.FreeformBuilder")
@js.native
class FreeformBuilder protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var `Office.FreeformBuilder_typekey`: FreeformBuilder = js.native
  val Parent: js.Any = js.native
  /**
           * @param X2 [X2=0]
           * @param Y2 [Y2=0]
           * @param X3 [X3=0]
           * @param Y3 [Y3=0]
           */
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: scala.Double, Y1: scala.Double): scala.Unit = js.native
  /**
           * @param X2 [X2=0]
           * @param Y2 [Y2=0]
           * @param X3 [X3=0]
           * @param Y3 [Y3=0]
           */
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double
  ): scala.Unit = js.native
  /**
           * @param X2 [X2=0]
           * @param Y2 [Y2=0]
           * @param X3 [X3=0]
           * @param Y3 [Y3=0]
           */
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double
  ): scala.Unit = js.native
  /**
           * @param X2 [X2=0]
           * @param Y2 [Y2=0]
           * @param X3 [X3=0]
           * @param Y3 [Y3=0]
           */
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double
  ): scala.Unit = js.native
  /**
           * @param X2 [X2=0]
           * @param Y2 [Y2=0]
           * @param X3 [X3=0]
           * @param Y3 [Y3=0]
           */
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double,
    Y3: scala.Double
  ): scala.Unit = js.native
  def ConvertToShape(): Shape = js.native
}

