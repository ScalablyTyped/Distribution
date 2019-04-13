package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text field.
    */
  var AnalysisScheme: js.UndefOr[Word] = js.undefined
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.undefined
  /**
    * Whether highlights can be returned for the field.
    */
  var HighlightEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.undefined
  var SourceField: js.UndefOr[FieldName] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    AnalysisScheme: Word = null,
    DefaultValue: FieldValue = null,
    HighlightEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SortEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceField: FieldName = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (AnalysisScheme != null) __obj.updateDynamic("AnalysisScheme")(AnalysisScheme)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(HighlightEnabled)) __obj.updateDynamic("HighlightEnabled")(HighlightEnabled)
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled)
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled)
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField)
    __obj.asInstanceOf[TextOptions]
  }
}

