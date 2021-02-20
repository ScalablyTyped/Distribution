package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkPageControl extends StObject {
  
  @JSName("Outlook.OlkPageControl_typekey")
  var OutlookDotOlkPageControl_typekey: OlkPageControl = js.native
  
  var Page: OlPageType = js.native
}
object OlkPageControl {
  
  @scala.inline
  def apply(OutlookDotOlkPageControl_typekey: OlkPageControl, Page: OlPageType): OlkPageControl = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkPageControl_typekey")(OutlookDotOlkPageControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkPageControl]
  }
  
  @scala.inline
  implicit class OlkPageControlMutableBuilder[Self <: OlkPageControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutlookDotOlkPageControl_typekey(value: OlkPageControl): Self = StObject.set(x, "Outlook.OlkPageControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: OlPageType): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
  }
}
