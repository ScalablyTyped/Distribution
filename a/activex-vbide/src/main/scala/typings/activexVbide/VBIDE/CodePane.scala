package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodePane extends StObject {
  
  val CodeModule: typings.activexVbide.VBIDE.CodeModule = js.native
  
  val CodePaneView: vbextCodePaneview = js.native
  
  def Collection(index: js.Any): CodePane = js.native
  @JSName("Collection")
  val Collection_Original: CodePanes = js.native
  
  val CountOfVisibleLines: Double = js.native
  
  def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  
  def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  
  def Show(): Unit = js.native
  
  var TopLine: Double = js.native
  
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  
  @JSName("VBIDE.CodePane_typekey")
  var VBIDEDotCodePane_typekey: CodePane = js.native
  
  val Window: typings.activexVbide.VBIDE.Window = js.native
}
