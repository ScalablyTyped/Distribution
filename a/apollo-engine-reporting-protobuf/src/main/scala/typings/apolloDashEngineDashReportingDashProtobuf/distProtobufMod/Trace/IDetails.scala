package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Details. */
trait IDetails extends js.Object {
  /** Details operationName */
  var operationName: js.UndefOr[String | Null] = js.undefined
  /** Details rawQuery */
  var rawQuery: js.UndefOr[String | Null] = js.undefined
  /** Details variables */
  var variables: js.UndefOr[StringDictionary[Uint8Array] | Null] = js.undefined
  /** Details variablesJson */
  var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}

object IDetails {
  @scala.inline
  def apply(
    operationName: String = null,
    rawQuery: String = null,
    variables: StringDictionary[Uint8Array] = null,
    variablesJson: StringDictionary[String] = null
  ): IDetails = {
    val __obj = js.Dynamic.literal()
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (rawQuery != null) __obj.updateDynamic("rawQuery")(rawQuery)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    if (variablesJson != null) __obj.updateDynamic("variablesJson")(variablesJson)
    __obj.asInstanceOf[IDetails]
  }
}

