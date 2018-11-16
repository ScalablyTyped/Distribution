package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

/**
     * Enum is used in aiDataContract to describe how fields are serialized.
     * For instance: (Fieldtype.Required | FieldType.Array) will mark the field as required and indicate it's an array
     */
@JSGlobal("Microsoft.ApplicationInsights.FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait Array
    extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  
  @js.native
  sealed trait Default
    extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  
  @js.native
  sealed trait Hidden
    extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  
  @js.native
  sealed trait Required
    extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  
  /* 2 */ val Array: Array with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 4 */ val Hidden: Hidden with scala.Double = js.native
  /* 1 */ val Required: Required with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType with scala.Double
  ] = js.native
}

