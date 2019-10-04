package typings.akuminaDashCore.interfacesIGetListRequestMod

import typings.akuminaDashCore.interfacesILanguageRequestMod.ILanguageRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetListRequest extends js.Object {
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
    viewXml: String,
    PageManager: js.Any = null,
    language: ILanguageRequest = null,
    orderBy: js.Any = null,
    preloadCallback: js.Any = null,
    queryFilter: js.Any = null
  ): IGetListRequest = {
    val __obj = js.Dynamic.literal(additionalSelectFields = additionalSelectFields, contextSiteUrl = contextSiteUrl, expandFields = expandFields, hostUrl = hostUrl, isHosted = isHosted, isPagedResult = isPagedResult, isRoot = isRoot, listName = listName, personaCheckRequired = personaCheckRequired, postData = postData, rowLimit = rowLimit, selectFields = selectFields, viewXml = viewXml)
    if (PageManager != null) __obj.updateDynamic("PageManager")(PageManager)
    if (language != null) __obj.updateDynamic("language")(language)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (preloadCallback != null) __obj.updateDynamic("preloadCallback")(preloadCallback)
    if (queryFilter != null) __obj.updateDynamic("queryFilter")(queryFilter)
    __obj.asInstanceOf[IGetListRequest]
  }
}

