package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoConnectorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ConnectorFormat")
@js.native
class ConnectorFormat protected ()
  extends StObject
     with typings.activexWord.Word.ConnectorFormat {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def BeginConnect(ConnectedShape: typings.activexWord.Word.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val BeginConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val BeginConnectedShape: typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val BeginConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def BeginDisconnect(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def EndConnect(ConnectedShape: typings.activexWord.Word.Shape, ConnectionSite: Double): Unit = js.native
  
  /* CompleteClass */
  override val EndConnected: MsoTriState = js.native
  
  /* CompleteClass */
  override val EndConnectedShape: typings.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  override val EndConnectionSite: Double = js.native
  
  /* CompleteClass */
  override def EndDisconnect(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Type: MsoConnectorType = js.native
  
  /* CompleteClass */
  @JSName("Word.ConnectorFormat_typekey")
  var WordDotConnectorFormat_typekey: typings.activexWord.Word.ConnectorFormat = js.native
}
