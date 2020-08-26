package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramNodes extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.DiagramNodes_typekey")
  var WordDotDiagramNodes_typekey: DiagramNodes = js.native
  def Item(Index: js.Any): DiagramNode = js.native
  def SelectAll(): Unit = js.native
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
  @scala.inline
  implicit class DiagramNodesOps[Self <: DiagramNodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => DiagramNode): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAll(value: () => Unit): Self = this.set("SelectAll", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotDiagramNodes_typekey(value: DiagramNodes): Self = this.set("Word.DiagramNodes_typekey", value.asInstanceOf[js.Any])
  }
  
}

