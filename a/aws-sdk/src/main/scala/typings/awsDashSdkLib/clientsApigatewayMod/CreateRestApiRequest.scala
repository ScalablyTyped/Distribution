package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRestApiRequest extends js.Object {
  /**
    * The source of the API key for metering requests according to a usage plan. Valid values are: HEADER to read the API key from the X-API-Key header of a request. AUTHORIZER to read the API key from the UsageIdentifierKey from a custom authorizer. 
    */
  var apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined
  /**
    * The list of binary media types supported by the RestApi. By default, the RestApi supports only UTF-8-encoded text payloads.
    */
  var binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined
  /**
    * The ID of the RestApi that you want to clone from.
    */
  var cloneFrom: js.UndefOr[String] = js.undefined
  /**
    * The description of the RestApi.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The endpoint configuration of this RestApi showing the endpoint types of the API. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  /**
    * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size.
    */
  var minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined
  /**
    * [Required] The name of the RestApi.
    */
  var name: String
  /**
    * A stringified JSON policy document that applies to this RestApi regardless of the caller and Method configuration.
    */
  var policy: js.UndefOr[String] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A version identifier for the API.
    */
  var version: js.UndefOr[String] = js.undefined
}

object CreateRestApiRequest {
  @scala.inline
  def apply(
    name: String,
    apiKeySource: ApiKeySourceType = null,
    binaryMediaTypes: ListOfString = null,
    cloneFrom: String = null,
    description: String = null,
    endpointConfiguration: EndpointConfiguration = null,
    minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined,
    policy: String = null,
    tags: MapOfStringToString = null,
    version: String = null
  ): CreateRestApiRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (apiKeySource != null) __obj.updateDynamic("apiKeySource")(apiKeySource.asInstanceOf[js.Any])
    if (binaryMediaTypes != null) __obj.updateDynamic("binaryMediaTypes")(binaryMediaTypes)
    if (cloneFrom != null) __obj.updateDynamic("cloneFrom")(cloneFrom)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration)
    if (!js.isUndefined(minimumCompressionSize)) __obj.updateDynamic("minimumCompressionSize")(minimumCompressionSize)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CreateRestApiRequest]
  }
}

