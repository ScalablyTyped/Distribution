package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormRegionStartup extends StObject {
  
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
  
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: FormRegionStartup
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
  implicit class FormRegionStartupMutableBuilder[Self <: FormRegionStartup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeFormRegionShow(value: FormRegion => Unit): Self = StObject.set(x, "BeforeFormRegionShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormRegionIcon(value: (String, Double, OlFormRegionIcon) => js.Any): Self = StObject.set(x, "GetFormRegionIcon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFormRegionManifest(value: (String, Double) => js.Any): Self = StObject.set(x, "GetFormRegionManifest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFormRegionStorage(value: (String, js.Any, Double, OlFormRegionMode, OlFormRegionSize) => js.Any): Self = StObject.set(x, "GetFormRegionStorage", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOutlookDotFormRegionStartup_typekey(value: FormRegionStartup): Self = StObject.set(x, "Outlook.FormRegionStartup_typekey", value.asInstanceOf[js.Any])
  }
}
