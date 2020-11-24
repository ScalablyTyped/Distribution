package typings.activexWord.Word

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagram extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoFormat: MsoTriState = js.native
  
  var AutoLayout: MsoTriState = js.native
  
  def Convert(Type: MsoDiagramType): Unit = js.native
  
  val Creator: Double = js.native
  
  def FitText(): Unit = js.native
  
  val Nodes: DiagramNodes = js.native
  
  val Parent: js.Any = js.native
  
  var Reverse: MsoTriState = js.native
  
  val Type: MsoDiagramType = js.native
  
  @JSName("Word.Diagram_typekey")
  var WordDotDiagram_typekey: Diagram = js.native
}
object Diagram {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    Parent: js.Any,
    Reverse: MsoTriState,
    Type: MsoDiagramType,
    WordDotDiagram_typekey: Diagram
  ): Diagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Diagram_typekey")(WordDotDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagram]
  }
  
  @scala.inline
  implicit class DiagramOps[Self <: Diagram] (val x: Self) extends AnyVal {
    
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
    def setAutoFormat(value: MsoTriState): Self = this.set("AutoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLayout(value: MsoTriState): Self = this.set("AutoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert(value: MsoDiagramType => Unit): Self = this.set("Convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitText(value: () => Unit): Self = this.set("FitText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNodes(value: DiagramNodes): Self = this.set("Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: MsoTriState): Self = this.set("Reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoDiagramType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDiagram_typekey(value: Diagram): Self = this.set("Word.Diagram_typekey", value.asInstanceOf[js.Any])
  }
}
