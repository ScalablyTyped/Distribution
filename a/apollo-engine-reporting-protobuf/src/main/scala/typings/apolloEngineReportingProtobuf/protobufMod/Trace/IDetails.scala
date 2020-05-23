package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Details. */
trait IDetails extends js.Object {
  /** Details deprecatedVariables */
  var deprecatedVariables: js.UndefOr[StringDictionary[Uint8Array] | Null] = js.undefined
  /** Details operationName */
  var operationName: js.UndefOr[String | Null] = js.undefined
  /** Details variablesJson */
  var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}

object IDetails {
  @scala.inline
  def apply(
    deprecatedVariables: js.UndefOr[Null | StringDictionary[Uint8Array]] = js.undefined,
    operationName: js.UndefOr[Null | String] = js.undefined,
    variablesJson: js.UndefOr[Null | StringDictionary[String]] = js.undefined
  ): IDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecatedVariables)) __obj.updateDynamic("deprecatedVariables")(deprecatedVariables.asInstanceOf[js.Any])
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (!js.isUndefined(variablesJson)) __obj.updateDynamic("variablesJson")(variablesJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetails]
  }
}

