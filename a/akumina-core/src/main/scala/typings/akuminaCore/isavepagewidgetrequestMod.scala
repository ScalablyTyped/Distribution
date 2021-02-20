package typings.akuminaCore

import typings.akuminaCore.ipagewidgetMod.IPageWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isavepagewidgetrequestMod {
  
  @js.native
  trait ISavePageWidgetRequest extends StObject {
    
    var pageId: String = js.native
    
    var pageWidgets: js.Array[IPageWidget] = js.native
  }
  object ISavePageWidgetRequest {
    
    @scala.inline
    def apply(pageId: String, pageWidgets: js.Array[IPageWidget]): ISavePageWidgetRequest = {
      val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISavePageWidgetRequest]
    }
    
    @scala.inline
    implicit class ISavePageWidgetRequestMutableBuilder[Self <: ISavePageWidgetRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidgets(value: js.Array[IPageWidget]): Self = StObject.set(x, "pageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidgetsVarargs(value: IPageWidget*): Self = StObject.set(x, "pageWidgets", js.Array(value :_*))
    }
  }
}
