package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformFilterCriteria extends js.Object {
  /**
    * The time and date after which the transforms were created.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.native
  /**
    * The time and date before which the transforms were created.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.native
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * Filter on transforms last modified after this date.
    */
  var LastModifiedAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filter on transforms last modified before this date.
    */
  var LastModifiedBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A unique transform name that is used to filter the machine learning transforms.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Filters on datasets with a specific schema. The Map&lt;Column, Type&gt; object is an array of key-value pairs representing the schema this transform accepts, where Column is the name of a column, and Type is the type of the data such as an integer or string. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.native
  /**
    * Filters the list of machine learning transforms by the last known status of the transforms (to indicate whether a transform can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.native
  /**
    * The type of machine learning transform that is used to filter the machine learning transforms.
    */
  var TransformType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TransformType] = js.native
}

object TransformFilterCriteria {
  @scala.inline
  def apply(
    CreatedAfter: Timestamp = null,
    CreatedBefore: Timestamp = null,
    GlueVersion: GlueVersionString = null,
    LastModifiedAfter: Timestamp = null,
    LastModifiedBefore: Timestamp = null,
    Name: NameString = null,
    Schema: TransformSchema = null,
    Status: TransformStatusType = null,
    TransformType: TransformType = null
  ): TransformFilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter.asInstanceOf[js.Any])
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (LastModifiedAfter != null) __obj.updateDynamic("LastModifiedAfter")(LastModifiedAfter.asInstanceOf[js.Any])
    if (LastModifiedBefore != null) __obj.updateDynamic("LastModifiedBefore")(LastModifiedBefore.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TransformType != null) __obj.updateDynamic("TransformType")(TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformFilterCriteria]
  }
}

