package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicLayout extends StObject {
  
  /**
    * This represents sections in a tab of the page layout.
    */
  var moreInfo: js.UndefOr[LayoutSections] = js.undefined
  
  /**
    * This represents sections in a panel of the page layout.
    */
  var topPanel: js.UndefOr[LayoutSections] = js.undefined
}
object BasicLayout {
  
  inline def apply(): BasicLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicLayout] (val x: Self) extends AnyVal {
    
    inline def setMoreInfo(value: LayoutSections): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
    
    inline def setMoreInfoUndefined: Self = StObject.set(x, "moreInfo", js.undefined)
    
    inline def setTopPanel(value: LayoutSections): Self = StObject.set(x, "topPanel", value.asInstanceOf[js.Any])
    
    inline def setTopPanelUndefined: Self = StObject.set(x, "topPanel", js.undefined)
  }
}
