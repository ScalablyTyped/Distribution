package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Balloon extends StObject {
  
  var Animation: MsoAnimationType = js.native
  
  val Application: js.Any = js.native
  
  var BalloonType: MsoBalloonType = js.native
  
  var Button: MsoButtonSetType = js.native
  
  var Callback: String = js.native
  
  def Checkboxes(Index: Double): BalloonCheckbox = js.native
  @JSName("Checkboxes")
  val Checkboxes_Original: BalloonCheckboxes = js.native
  
  def Close(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Heading: String = js.native
  
  var Icon: MsoIconType = js.native
  
  def Labels(Index: Double): BalloonLabel = js.native
  @JSName("Labels")
  val Labels_Original: BalloonLabels = js.native
  
  var Mode: MsoModeType = js.native
  
  val Name: String = js.native
  
  @JSName("Office.Balloon_typekey")
  var OfficeDotBalloon_typekey: Balloon = js.native
  
  val Parent: js.Any = js.native
  
  var Private: Double = js.native
  
  def SetAvoidRectangle(Left: Double, Top: Double, Right: Double, Bottom: Double): Unit = js.native
  
  def Show(): MsoBalloonButtonType = js.native
  
  var Text: String = js.native
}
