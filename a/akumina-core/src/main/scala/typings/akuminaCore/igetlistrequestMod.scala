package typings.akuminaCore

import typings.akuminaCore.ilanguagerequestMod.ILanguageRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igetlistrequestMod {
  
  trait IGetListRequest extends StObject {
    
    var PageManager: js.UndefOr[js.Any] = js.undefined
    
    var additionalSelectFields: String
    
    var contextSiteUrl: String
    
    var expandFields: String
    
    var hostUrl: String
    
    var isHosted: Boolean
    
    var isPagedResult: Boolean
    
    var isRoot: Boolean
    
    var language: js.UndefOr[ILanguageRequest] = js.undefined
    
    var listName: String
    
    var orderBy: js.UndefOr[js.Any] = js.undefined
    
    var personaCheckRequired: Boolean
    
    var postData: js.Object
    
    var preloadCallback: js.UndefOr[js.Any] = js.undefined
    
    var queryFilter: js.UndefOr[js.Any] = js.undefined
    
    var rowLimit: Double
    
    var selectFields: String
    
    var viewXml: String
  }
  object IGetListRequest {
    
    @scala.inline
    def apply(
      additionalSelectFields: String,
      contextSiteUrl: String,
      expandFields: String,
      hostUrl: String,
      isHosted: Boolean,
      isPagedResult: Boolean,
      isRoot: Boolean,
      listName: String,
      personaCheckRequired: Boolean,
      postData: js.Object,
      rowLimit: Double,
      selectFields: String,
      viewXml: String
    ): IGetListRequest = {
      val __obj = js.Dynamic.literal(additionalSelectFields = additionalSelectFields.asInstanceOf[js.Any], contextSiteUrl = contextSiteUrl.asInstanceOf[js.Any], expandFields = expandFields.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isPagedResult = isPagedResult.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], personaCheckRequired = personaCheckRequired.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], rowLimit = rowLimit.asInstanceOf[js.Any], selectFields = selectFields.asInstanceOf[js.Any], viewXml = viewXml.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetListRequest]
    }
    
    @scala.inline
    implicit class IGetListRequestMutableBuilder[Self <: IGetListRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalSelectFields(value: String): Self = StObject.set(x, "additionalSelectFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextSiteUrl(value: String): Self = StObject.set(x, "contextSiteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandFields(value: String): Self = StObject.set(x, "expandFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHosted(value: Boolean): Self = StObject.set(x, "isHosted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPagedResult(value: Boolean): Self = StObject.set(x, "isPagedResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: ILanguageRequest): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setListName(value: String): Self = StObject.set(x, "listName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderBy(value: js.Any): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setPageManager(value: js.Any): Self = StObject.set(x, "PageManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageManagerUndefined: Self = StObject.set(x, "PageManager", js.undefined)
      
      @scala.inline
      def setPersonaCheckRequired(value: Boolean): Self = StObject.set(x, "personaCheckRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostData(value: js.Object): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadCallback(value: js.Any): Self = StObject.set(x, "preloadCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadCallbackUndefined: Self = StObject.set(x, "preloadCallback", js.undefined)
      
      @scala.inline
      def setQueryFilter(value: js.Any): Self = StObject.set(x, "queryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFilterUndefined: Self = StObject.set(x, "queryFilter", js.undefined)
      
      @scala.inline
      def setRowLimit(value: Double): Self = StObject.set(x, "rowLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectFields(value: String): Self = StObject.set(x, "selectFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewXml(value: String): Self = StObject.set(x, "viewXml", value.asInstanceOf[js.Any])
    }
  }
}
