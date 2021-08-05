package typings.activexOffice.global.Office

import typings.activexOffice.Office.BalloonCheckboxes
import typings.activexOffice.Office.BalloonLabels
import typings.activexOffice.Office.MsoAnimationType
import typings.activexOffice.Office.MsoBalloonButtonType
import typings.activexOffice.Office.MsoBalloonType
import typings.activexOffice.Office.MsoButtonSetType
import typings.activexOffice.Office.MsoIconType
import typings.activexOffice.Office.MsoModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Balloon")
@js.native
/* private */ class Balloon ()
  extends StObject
     with typings.activexOffice.Office.Balloon {
  
  /* CompleteClass */
  var Animation: MsoAnimationType = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var BalloonType: MsoBalloonType = js.native
  
  /* CompleteClass */
  var Button: MsoButtonSetType = js.native
  
  /* CompleteClass */
  var Callback: String = js.native
  
  /* CompleteClass */
  override def Checkboxes(Index: Double): typings.activexOffice.Office.BalloonCheckbox = js.native
  /* CompleteClass */
  @JSName("Checkboxes")
  override val Checkboxes_Original: BalloonCheckboxes = js.native
  
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Heading: String = js.native
  
  /* CompleteClass */
  var Icon: MsoIconType = js.native
  
  /* CompleteClass */
  override def Labels(Index: Double): typings.activexOffice.Office.BalloonLabel = js.native
  /* CompleteClass */
  @JSName("Labels")
  override val Labels_Original: BalloonLabels = js.native
  
  /* CompleteClass */
  var Mode: MsoModeType = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Balloon_typekey")
  var OfficeDotBalloon_typekey: typings.activexOffice.Office.Balloon = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Private: Double = js.native
  
  /* CompleteClass */
  override def SetAvoidRectangle(Left: Double, Top: Double, Right: Double, Bottom: Double): Unit = js.native
  
  /* CompleteClass */
  override def Show(): MsoBalloonButtonType = js.native
  
  /* CompleteClass */
  var Text: String = js.native
}
