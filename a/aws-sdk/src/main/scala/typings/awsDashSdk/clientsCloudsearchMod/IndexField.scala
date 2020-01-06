package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexField extends js.Object {
  var DateArrayOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.DateArrayOptions] = js.native
  var DateOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.DateOptions] = js.native
  var DoubleArrayOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.DoubleArrayOptions] = js.native
  var DoubleOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.DoubleOptions] = js.native
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName = js.native
  var IndexFieldType: typings.awsDashSdk.clientsCloudsearchMod.IndexFieldType = js.native
  var IntArrayOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.IntArrayOptions] = js.native
  var IntOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.IntOptions] = js.native
  var LatLonOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.LatLonOptions] = js.native
  var LiteralArrayOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.LiteralArrayOptions] = js.native
  var LiteralOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.LiteralOptions] = js.native
  var TextArrayOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.TextArrayOptions] = js.native
  var TextOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.TextOptions] = js.native
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
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName.asInstanceOf[js.Any], IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    if (DateArrayOptions != null) __obj.updateDynamic("DateArrayOptions")(DateArrayOptions.asInstanceOf[js.Any])
    if (DateOptions != null) __obj.updateDynamic("DateOptions")(DateOptions.asInstanceOf[js.Any])
    if (DoubleArrayOptions != null) __obj.updateDynamic("DoubleArrayOptions")(DoubleArrayOptions.asInstanceOf[js.Any])
    if (DoubleOptions != null) __obj.updateDynamic("DoubleOptions")(DoubleOptions.asInstanceOf[js.Any])
    if (IntArrayOptions != null) __obj.updateDynamic("IntArrayOptions")(IntArrayOptions.asInstanceOf[js.Any])
    if (IntOptions != null) __obj.updateDynamic("IntOptions")(IntOptions.asInstanceOf[js.Any])
    if (LatLonOptions != null) __obj.updateDynamic("LatLonOptions")(LatLonOptions.asInstanceOf[js.Any])
    if (LiteralArrayOptions != null) __obj.updateDynamic("LiteralArrayOptions")(LiteralArrayOptions.asInstanceOf[js.Any])
    if (LiteralOptions != null) __obj.updateDynamic("LiteralOptions")(LiteralOptions.asInstanceOf[js.Any])
    if (TextArrayOptions != null) __obj.updateDynamic("TextArrayOptions")(TextArrayOptions.asInstanceOf[js.Any])
    if (TextOptions != null) __obj.updateDynamic("TextOptions")(TextOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
}

