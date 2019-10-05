package typings.applicationinsightsDashJs.Microsoft.ApplicationInsights

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
  sealed trait Array extends FieldType
  
  @js.native
  sealed trait Default extends FieldType
  
  @js.native
  sealed trait Hidden extends FieldType
  
  @js.native
  sealed trait Required extends FieldType
  
  /* 2 */ val Array: typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType.Array with Double = js.native
  /* 0 */ val Default: typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType.Default with Double = js.native
  /* 4 */ val Hidden: typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType.Hidden with Double = js.native
  /* 1 */ val Required: typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType.Required with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
}

