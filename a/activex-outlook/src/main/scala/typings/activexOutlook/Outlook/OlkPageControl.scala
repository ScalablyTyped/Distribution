package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkPageControl extends StObject {
  
  /* private */ @JSName("Outlook.OlkPageControl_typekey")
  var OutlookDotOlkPageControl_typekey: OlkPageControl
  
  var Page: OlPageType
}
object OlkPageControl {
  
  inline def apply(OutlookDotOlkPageControl_typekey: OlkPageControl, Page: OlPageType): OlkPageControl = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkPageControl_typekey")(OutlookDotOlkPageControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkPageControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OlkPageControl] (val x: Self) extends AnyVal {
    
    inline def setOutlookDotOlkPageControl_typekey(value: OlkPageControl): Self = StObject.set(x, "Outlook.OlkPageControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setPage(value: OlPageType): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
  }
}
