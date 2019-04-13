package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApi extends js.Object {
  /**
    * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer. 
    */
  var apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  var binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined
  /**
    * The timestamp when the API was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The API's description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  /**
    * The API's identifier. This identifier is unique across all of your APIs in API Gateway.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
    */
  var minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The API's name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
    */
  var policy: js.UndefOr[String] = js.undefined
  /**
    * A version identifier for the API.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}

object RestApi {
  @scala.inline
  def apply(
    apiKeySource: ApiKeySourceType = null,
    binaryMediaTypes: ListOfString = null,
    createdDate: Timestamp = null,
    description: String = null,
    endpointConfiguration: EndpointConfiguration = null,
    id: String = null,
    minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined,
    name: String = null,
    policy: String = null,
    version: String = null,
    warnings: ListOfString = null
  ): RestApi = {
    val __obj = js.Dynamic.literal()
    if (apiKeySource != null) __obj.updateDynamic("apiKeySource")(apiKeySource.asInstanceOf[js.Any])
    if (binaryMediaTypes != null) __obj.updateDynamic("binaryMediaTypes")(binaryMediaTypes)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(minimumCompressionSize)) __obj.updateDynamic("minimumCompressionSize")(minimumCompressionSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (version != null) __obj.updateDynamic("version")(version)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[RestApi]
  }
}

