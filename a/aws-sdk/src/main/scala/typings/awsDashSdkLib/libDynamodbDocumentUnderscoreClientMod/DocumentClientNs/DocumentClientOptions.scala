package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentClientOptions extends ConverterOptions {
  /**
    * An optional map of parameters to bind to every request sent by this service object.
    */
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
    */
  var service: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.^] = js.undefined
}

object DocumentClientOptions {
  @scala.inline
  def apply(
    convertEmptyValues: js.UndefOr[scala.Boolean] = js.undefined,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    service: awsDashSdkLib.clientsDynamodbMod.^ = null,
    wrapNumbers: js.UndefOr[scala.Boolean] = js.undefined
  ): DocumentClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertEmptyValues)) __obj.updateDynamic("convertEmptyValues")(convertEmptyValues)
    if (params != null) __obj.updateDynamic("params")(params)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(wrapNumbers)) __obj.updateDynamic("wrapNumbers")(wrapNumbers)
    __obj.asInstanceOf[DocumentClientOptions]
  }
}

