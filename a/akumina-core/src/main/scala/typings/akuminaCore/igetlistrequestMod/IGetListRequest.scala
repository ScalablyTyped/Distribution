package typings.akuminaCore.igetlistrequestMod

import typings.akuminaCore.ilanguagerequestMod.ILanguageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetListRequest extends js.Object {
  
  var PageManager: js.UndefOr[js.Any] = js.native
  
  var additionalSelectFields: String = js.native
  
  var contextSiteUrl: String = js.native
  
  var expandFields: String = js.native
  
  var hostUrl: String = js.native
  
  var isHosted: Boolean = js.native
  
  var isPagedResult: Boolean = js.native
  
  var isRoot: Boolean = js.native
  
  var language: js.UndefOr[ILanguageRequest] = js.native
  
  var listName: String = js.native
  
  var orderBy: js.UndefOr[js.Any] = js.native
  
  var personaCheckRequired: Boolean = js.native
  
  var postData: js.Object = js.native
  
  var preloadCallback: js.UndefOr[js.Any] = js.native
  
  var queryFilter: js.UndefOr[js.Any] = js.native
  
  var rowLimit: Double = js.native
  
  var selectFields: String = js.native
  
  var viewXml: String = js.native
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
  implicit class IGetListRequestOps[Self <: IGetListRequest] (val x: Self) extends AnyVal {
    
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
    def setAdditionalSelectFields(value: String): Self = this.set("additionalSelectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSiteUrl(value: String): Self = this.set("contextSiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandFields(value: String): Self = this.set("expandFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUrl(value: String): Self = this.set("hostUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHosted(value: Boolean): Self = this.set("isHosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPagedResult(value: Boolean): Self = this.set("isPagedResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListName(value: String): Self = this.set("listName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonaCheckRequired(value: Boolean): Self = this.set("personaCheckRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostData(value: js.Object): Self = this.set("postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLimit(value: Double): Self = this.set("rowLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFields(value: String): Self = this.set("selectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewXml(value: String): Self = this.set("viewXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageManager(value: js.Any): Self = this.set("PageManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageManager: Self = this.set("PageManager", js.undefined)
    
    @scala.inline
    def setLanguage(value: ILanguageRequest): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Any): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPreloadCallback(value: js.Any): Self = this.set("preloadCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadCallback: Self = this.set("preloadCallback", js.undefined)
    
    @scala.inline
    def setQueryFilter(value: js.Any): Self = this.set("queryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryFilter: Self = this.set("queryFilter", js.undefined)
  }
}
