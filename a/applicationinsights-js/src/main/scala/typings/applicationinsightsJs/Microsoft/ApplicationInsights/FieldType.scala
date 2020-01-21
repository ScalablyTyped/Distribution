package typings.applicationinsightsJs.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  /* 2 */ @js.native
  object Array extends TopLevel[Array with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 4 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 1 */ @js.native
  object Required extends TopLevel[Required with Double]
  
}

