package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlFormRegionIcon
import typings.activexOutlook.Outlook.OlFormRegionMode
import typings.activexOutlook.Outlook.OlFormRegionSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegionStartup")
@js.native
class FormRegionStartup protected ()
  extends typings.activexOutlook.Outlook.FormRegionStartup {
  /* CompleteClass */
  @JSName("Outlook.FormRegionStartup_typekey")
  override var OutlookDotFormRegionStartup_typekey: typings.activexOutlook.Outlook.FormRegionStartup = js.native
  /* CompleteClass */
  override def BeforeFormRegionShow(FormRegion: typings.activexOutlook.Outlook.FormRegion): Unit = js.native
  /* CompleteClass */
  override def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): js.Any = js.native
  /* CompleteClass */
  override def GetFormRegionManifest(FormRegionName: String, LCID: Double): js.Any = js.native
  /* CompleteClass */
  override def GetFormRegionStorage(
    FormRegionName: String,
    Item: js.Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any = js.native
}

