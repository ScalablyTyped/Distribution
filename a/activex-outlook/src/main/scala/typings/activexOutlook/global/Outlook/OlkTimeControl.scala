package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlBackStyle
import typings.activexOutlook.Outlook.OlEnterFieldBehavior
import typings.activexOutlook.Outlook.OlMousePointer
import typings.activexOutlook.Outlook.OlTextAlign
import typings.activexOutlook.Outlook.OlTimeStyle
import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.OlkTimeControl")
@js.native
/* private */ open class OlkTimeControl ()
  extends StObject
     with typings.activexOutlook.Outlook.OlkTimeControl {
  
  /* CompleteClass */
  var AutoSize: Boolean = js.native
  
  /* CompleteClass */
  var AutoWordSelect: Boolean = js.native
  
  /* CompleteClass */
  var BackColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  var BackStyle: OlBackStyle = js.native
  
  /* CompleteClass */
  override def DropDown(): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  
  /* CompleteClass */
  override val Font: StdFont = js.native
  
  /* CompleteClass */
  var ForeColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  var HideSelection: Boolean = js.native
  
  /* CompleteClass */
  var IntervalTime: VarDate = js.native
  
  /* CompleteClass */
  var Locked: Boolean = js.native
  
  /* CompleteClass */
  var MouseIcon: StdPicture = js.native
  
  /* CompleteClass */
  var MousePointer: OlMousePointer = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: typings.activexOutlook.Outlook.OlkTimeControl = js.native
  
  /* CompleteClass */
  var ReferenceTime: VarDate = js.native
  
  /* CompleteClass */
  var Style: OlTimeStyle = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* CompleteClass */
  var TextAlign: OlTextAlign = js.native
  
  /* CompleteClass */
  var Time: VarDate = js.native
  
  /* CompleteClass */
  var Value: Any = js.native
}
