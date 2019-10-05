package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.clientsDynamodbMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentClientOptions extends ConverterOptions {
  /**
    * An optional map of parameters to bind to every request sent by this service object.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
    */
  var service: js.UndefOr[^] = js.undefined
}

object DocumentClientOptions {
  @scala.inline
  def apply(
    convertEmptyValues: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[js.Any] = null,
    service: ^ = null,
    wrapNumbers: js.UndefOr[Boolean] = js.undefined
  ): DocumentClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEmptyValues)) __obj.updateDynamic("convertEmptyValues")(convertEmptyValues)
    if (params != null) __obj.updateDynamic("params")(params)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(wrapNumbers)) __obj.updateDynamic("wrapNumbers")(wrapNumbers)
    __obj.asInstanceOf[DocumentClientOptions]
  }
}

