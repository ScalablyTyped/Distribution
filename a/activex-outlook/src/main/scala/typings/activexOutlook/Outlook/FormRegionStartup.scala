package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegionStartup")
@js.native
class FormRegionStartup protected () extends js.Object {
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup = js.native
  def BeforeFormRegionShow(FormRegion: FormRegion): Unit = js.native
  def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): js.Any = js.native
  def GetFormRegionManifest(FormRegionName: String, LCID: Double): js.Any = js.native
  def GetFormRegionStorage(
    FormRegionName: String,
    Item: js.Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any = js.native
}

