package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodePane extends StObject {
  
  val CodeModule: typings.activexVbide.VBIDE.CodeModule
  
  val CodePaneView: vbextCodePaneview
  
  def Collection(index: Any): CodePane
  @JSName("Collection")
  val Collection_Original: CodePanes
  
  val CountOfVisibleLines: Double
  
  def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit
  
  def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit
  
  def Show(): Unit
  
  var TopLine: Double
  
  val VBE: typings.activexVbide.VBIDE.VBE
  
  /* private */ @JSName("VBIDE.CodePane_typekey")
  var VBIDEDotCodePane_typekey: CodePane
  
  val Window: typings.activexVbide.VBIDE.Window
}
object CodePane {
  
  inline def apply(
    CodeModule: CodeModule,
    CodePaneView: vbextCodePaneview,
    Collection: CodePanes,
    CountOfVisibleLines: Double,
    GetSelection: (Double, Double, Double, Double) => Unit,
    SetSelection: (Double, Double, Double, Double) => Unit,
    Show: () => Unit,
    TopLine: Double,
    VBE: VBE,
    VBIDEDotCodePane_typekey: CodePane,
    Window: Window
  ): CodePane = {
    val __obj = js.Dynamic.literal(CodeModule = CodeModule.asInstanceOf[js.Any], CodePaneView = CodePaneView.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], CountOfVisibleLines = CountOfVisibleLines.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction4(GetSelection), SetSelection = js.Any.fromFunction4(SetSelection), Show = js.Any.fromFunction0(Show), TopLine = TopLine.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.CodePane_typekey")(VBIDEDotCodePane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePane]
  }
  
  extension [Self <: CodePane](x: Self) {
    
    inline def setCodeModule(value: CodeModule): Self = StObject.set(x, "CodeModule", value.asInstanceOf[js.Any])
    
    inline def setCodePaneView(value: vbextCodePaneview): Self = StObject.set(x, "CodePaneView", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: CodePanes): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setCountOfVisibleLines(value: Double): Self = StObject.set(x, "CountOfVisibleLines", value.asInstanceOf[js.Any])
    
    inline def setGetSelection(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "GetSelection", js.Any.fromFunction4(value))
    
    inline def setSetSelection(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "SetSelection", js.Any.fromFunction4(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    inline def setTopLine(value: Double): Self = StObject.set(x, "TopLine", value.asInstanceOf[js.Any])
    
    inline def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotCodePane_typekey(value: CodePane): Self = StObject.set(x, "VBIDE.CodePane_typekey", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Window): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
