package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartArt extends StObject {
  
  def AllNodes(Index: String): SmartArtNode = js.native
  def AllNodes(Index: Double): SmartArtNode = js.native
  @JSName("AllNodes")
  val AllNodes_Original: SmartArtNodes = js.native
  
  val Application: js.Any = js.native
  
  var Color: SmartArtColor = js.native
  
  val Creator: Double = js.native
  
  var Layout: SmartArtLayout = js.native
  
  def Nodes(Index: String): SmartArtNode = js.native
  def Nodes(Index: Double): SmartArtNode = js.native
  @JSName("Nodes")
  val Nodes_Original: SmartArtNodes = js.native
  
  @JSName("Office.SmartArt_typekey")
  var OfficeDotSmartArt_typekey: SmartArt = js.native
  
  val Parent: js.Any = js.native
  
  var QuickStyle: SmartArtQuickStyle = js.native
  
  def Reset(): Unit = js.native
  
  var Reverse: MsoTriState = js.native
}
