package typings.akuminaCore.igetlistrequestMod

import typings.akuminaCore.ilanguagerequestMod.ILanguageRequest
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
    val __obj = js.Dynamic.literal(additionalSelectFields = additionalSelectFields.asInstanceOf[js.Any], contextSiteUrl = contextSiteUrl.asInstanceOf[js.Any], expandFields = expandFields.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isPagedResult = isPagedResult.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], listName = listName.asInstanceOf[js.Any], personaCheckRequired = personaCheckRequired.asInstanceOf[js.Any], postData = postData.asInstanceOf[js.Any], rowLimit = rowLimit.asInstanceOf[js.Any], selectFields = selectFields.asInstanceOf[js.Any], viewXml = viewXml.asInstanceOf[js.Any])
    if (PageManager != null) __obj.updateDynamic("PageManager")(PageManager.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (preloadCallback != null) __obj.updateDynamic("preloadCallback")(preloadCallback.asInstanceOf[js.Any])
    if (queryFilter != null) __obj.updateDynamic("queryFilter")(queryFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetListRequest]
  }
}

