package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextArrayOptions extends js.Object {
  /**
    * The name of an analysis scheme for a text-array field.
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
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
}

object TextArrayOptions {
  @scala.inline
  def apply(
    AnalysisScheme: Word = null,
    DefaultValue: FieldValue = null,
    HighlightEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SourceFields: FieldNameCommaList = null
  ): TextArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (AnalysisScheme != null) __obj.updateDynamic("AnalysisScheme")(AnalysisScheme)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(HighlightEnabled)) __obj.updateDynamic("HighlightEnabled")(HighlightEnabled)
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled)
    if (SourceFields != null) __obj.updateDynamic("SourceFields")(SourceFields)
    __obj.asInstanceOf[TextArrayOptions]
  }
}

