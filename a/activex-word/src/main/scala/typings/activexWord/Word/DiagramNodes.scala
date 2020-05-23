package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramNodes extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.DiagramNodes_typekey")
  var WordDotDiagramNodes_typekey: DiagramNodes
  def Item(Index: js.Any): DiagramNode
  def SelectAll(): Unit
}

object DiagramNodes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => DiagramNode,
    Parent: js.Any,
    SelectAll: () => Unit,
    WordDotDiagramNodes_typekey: DiagramNodes
  ): DiagramNodes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.DiagramNodes_typekey")(WordDotDiagramNodes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramNodes]
  }
}

