package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlFormRegionIcon
import typings.activexOutlook.Outlook.OlFormRegionMode
import typings.activexOutlook.Outlook.OlFormRegionSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.FormRegionStartup")
@js.native
/* private */ open class FormRegionStartup ()
  extends StObject
     with typings.activexOutlook.Outlook.FormRegionStartup {
  
  /* CompleteClass */
  override def BeforeFormRegionShow(FormRegion: typings.activexOutlook.Outlook.FormRegion): Unit = js.native
  
  /* CompleteClass */
  override def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): Any = js.native
  
  /* CompleteClass */
  override def GetFormRegionManifest(FormRegionName: String, LCID: Double): Any = js.native
  
  /* CompleteClass */
  override def GetFormRegionStorage(
    FormRegionName: String,
    Item: Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: typings.activexOutlook.Outlook.FormRegionStartup = js.native
}
