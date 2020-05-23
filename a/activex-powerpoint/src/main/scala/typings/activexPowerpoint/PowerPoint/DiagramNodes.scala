package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramNodes extends js.Object {
  val Application: js.Any
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("PowerPoint.DiagramNodes_typekey")
  var PowerPointDotDiagramNodes_typekey: DiagramNodes
  def Item(Index: js.Any): DiagramNode
  def SelectAll(): Unit
}

object DiagramNodes {
  @scala.inline
  def apply(
    Application: js.Any,
    Count: Double,
    Creator: Double,
    Item: js.Any => DiagramNode,
    Parent: js.Any,
    PowerPointDotDiagramNodes_typekey: DiagramNodes,
    SelectAll: () => Unit
  ): DiagramNodes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("PowerPoint.DiagramNodes_typekey")(PowerPointDotDiagramNodes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramNodes]
  }
}

