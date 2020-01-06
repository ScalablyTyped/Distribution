package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text field.
    */
  var AnalysisScheme: js.UndefOr[Word] = js.native
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.native
  /**
    * Whether highlights can be returned for the field.
    */
  var HighlightEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.native
  var SourceField: js.UndefOr[FieldName] = js.native
}

object TextOptions {
  @scala.inline
  def apply(
    AnalysisScheme: Word = null,
    DefaultValue: FieldValue = null,
    HighlightEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SortEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SourceField: FieldName = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (AnalysisScheme != null) __obj.updateDynamic("AnalysisScheme")(AnalysisScheme.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(HighlightEnabled)) __obj.updateDynamic("HighlightEnabled")(HighlightEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled.asInstanceOf[js.Any])
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

