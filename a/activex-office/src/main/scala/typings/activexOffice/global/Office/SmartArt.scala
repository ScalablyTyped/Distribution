package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.SmartArtNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.SmartArt")
@js.native
/* private */ open class SmartArt ()
  extends StObject
     with typings.activexOffice.Office.SmartArt {
  
  /* CompleteClass */
  override def AllNodes(Index: String): typings.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  override def AllNodes(Index: Double): typings.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  @JSName("AllNodes")
  override val AllNodes_Original: SmartArtNodes = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var Color: typings.activexOffice.Office.SmartArtColor = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Layout: typings.activexOffice.Office.SmartArtLayout = js.native
  
  /* CompleteClass */
  override def Nodes(Index: String): typings.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  override def Nodes(Index: Double): typings.activexOffice.Office.SmartArtNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: SmartArtNodes = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.SmartArt_typekey")
  var OfficeDotSmartArt_typekey: typings.activexOffice.Office.SmartArt = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var QuickStyle: typings.activexOffice.Office.SmartArtQuickStyle = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
}
