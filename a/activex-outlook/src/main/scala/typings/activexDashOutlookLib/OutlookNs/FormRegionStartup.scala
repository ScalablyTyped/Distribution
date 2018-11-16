package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.FormRegionStartup")
@js.native
class FormRegionStartup protected () extends js.Object {
  var `Outlook.FormRegionStartup_typekey`: FormRegionStartup = js.native
  def BeforeFormRegionShow(FormRegion: FormRegion): scala.Unit = js.native
  def GetFormRegionIcon(FormRegionName: java.lang.String, LCID: scala.Double, Icon: OlFormRegionIcon): js.Any = js.native
  def GetFormRegionManifest(FormRegionName: java.lang.String, LCID: scala.Double): js.Any = js.native
  def GetFormRegionStorage(
    FormRegionName: java.lang.String,
    Item: js.Any,
    LCID: scala.Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): js.Any = js.native
}

