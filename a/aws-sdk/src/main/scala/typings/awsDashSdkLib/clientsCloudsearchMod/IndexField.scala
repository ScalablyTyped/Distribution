package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexField extends js.Object {
  var DateArrayOptions: js.UndefOr[DateArrayOptions] = js.undefined
  var DateOptions: js.UndefOr[DateOptions] = js.undefined
  var DoubleArrayOptions: js.UndefOr[DoubleArrayOptions] = js.undefined
  var DoubleOptions: js.UndefOr[DoubleOptions] = js.undefined
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName
  var IndexFieldType: awsDashSdkLib.clientsCloudsearchMod.IndexFieldType
  var IntArrayOptions: js.UndefOr[IntArrayOptions] = js.undefined
  var IntOptions: js.UndefOr[IntOptions] = js.undefined
  var LatLonOptions: js.UndefOr[LatLonOptions] = js.undefined
  var LiteralArrayOptions: js.UndefOr[LiteralArrayOptions] = js.undefined
  var LiteralOptions: js.UndefOr[LiteralOptions] = js.undefined
  var TextArrayOptions: js.UndefOr[TextArrayOptions] = js.undefined
  var TextOptions: js.UndefOr[TextOptions] = js.undefined
}

object IndexField {
  @scala.inline
  def apply(
    IndexFieldName: DynamicFieldName,
    IndexFieldType: IndexFieldType,
    DateArrayOptions: DateArrayOptions = null,
    DateOptions: DateOptions = null,
    DoubleArrayOptions: DoubleArrayOptions = null,
    DoubleOptions: DoubleOptions = null,
    IntArrayOptions: IntArrayOptions = null,
    IntOptions: IntOptions = null,
    LatLonOptions: LatLonOptions = null,
    LiteralArrayOptions: LiteralArrayOptions = null,
    LiteralOptions: LiteralOptions = null,
    TextArrayOptions: TextArrayOptions = null,
    TextOptions: TextOptions = null
  ): IndexField = {
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName, IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    if (DateArrayOptions != null) __obj.updateDynamic("DateArrayOptions")(DateArrayOptions)
    if (DateOptions != null) __obj.updateDynamic("DateOptions")(DateOptions)
    if (DoubleArrayOptions != null) __obj.updateDynamic("DoubleArrayOptions")(DoubleArrayOptions)
    if (DoubleOptions != null) __obj.updateDynamic("DoubleOptions")(DoubleOptions)
    if (IntArrayOptions != null) __obj.updateDynamic("IntArrayOptions")(IntArrayOptions)
    if (IntOptions != null) __obj.updateDynamic("IntOptions")(IntOptions)
    if (LatLonOptions != null) __obj.updateDynamic("LatLonOptions")(LatLonOptions)
    if (LiteralArrayOptions != null) __obj.updateDynamic("LiteralArrayOptions")(LiteralArrayOptions)
    if (LiteralOptions != null) __obj.updateDynamic("LiteralOptions")(LiteralOptions)
    if (TextArrayOptions != null) __obj.updateDynamic("TextArrayOptions")(TextArrayOptions)
    if (TextOptions != null) __obj.updateDynamic("TextOptions")(TextOptions)
    __obj.asInstanceOf[IndexField]
  }
}

