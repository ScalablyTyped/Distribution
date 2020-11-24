package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormRegionStartup extends js.Object {
  
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
  
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup = js.native
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
  
  @scala.inline
  implicit class FormRegionStartupOps[Self <: FormRegionStartup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeforeFormRegionShow(value: FormRegion => Unit): Self = this.set("BeforeFormRegionShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormRegionIcon(value: (String, Double, OlFormRegionIcon) => js.Any): Self = this.set("GetFormRegionIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFormRegionManifest(value: (String, Double) => js.Any): Self = this.set("GetFormRegionManifest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFormRegionStorage(value: (String, js.Any, Double, OlFormRegionMode, OlFormRegionSize) => js.Any): Self = this.set("GetFormRegionStorage", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOutlookDotFormRegionStartup_typekey(value: FormRegionStartup): Self = this.set("Outlook.FormRegionStartup_typekey", value.asInstanceOf[js.Any])
  }
}
