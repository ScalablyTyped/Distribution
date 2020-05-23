package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormRegionStartup extends js.Object {
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup
  def BeforeFormRegionShow(FormRegion: FormRegion): Unit
  def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): js.Any
  def GetFormRegionManifest(FormRegionName: String, LCID: Double): js.Any
  def GetFormRegionStorage(
    FormRegionName: String,
    Item: js.Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any
}

object FormRegionStartup {
  @scala.inline
  def apply(
    BeforeFormRegionShow: FormRegion => Unit,
    GetFormRegionIcon: (String, Double, OlFormRegionIcon) => js.Any,
    GetFormRegionManifest: (String, Double) => js.Any,
    GetFormRegionStorage: (String, js.Any, Double, OlFormRegionMode, OlFormRegionSize) => js.Any,
    OutlookDotFormRegionStartup_typekey: FormRegionStartup
  ): FormRegionStartup = {
    val __obj = js.Dynamic.literal(BeforeFormRegionShow = js.Any.fromFunction1(BeforeFormRegionShow), GetFormRegionIcon = js.Any.fromFunction3(GetFormRegionIcon), GetFormRegionManifest = js.Any.fromFunction2(GetFormRegionManifest), GetFormRegionStorage = js.Any.fromFunction5(GetFormRegionStorage))
    __obj.updateDynamic("Outlook.FormRegionStartup_typekey")(OutlookDotFormRegionStartup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegionStartup]
  }
}

