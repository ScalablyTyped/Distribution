package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAlignment
import typings.activexOutlook.Outlook.OlMousePointer
import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.OlkFrameHeader")
@js.native
/* private */ open class OlkFrameHeader ()
  extends StObject
     with typings.activexOutlook.Outlook.OlkFrameHeader {
  
  /* CompleteClass */
  var Alignment: OlAlignment = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  override val Font: StdFont = js.native
  
  /* CompleteClass */
  var ForeColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  var MouseIcon: StdPicture = js.native
  
  /* CompleteClass */
  var MousePointer: OlMousePointer = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: typings.activexOutlook.Outlook.OlkFrameHeader = js.native
}
