package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.OrcSerDe] = js.native
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.ParquetSerDe] = js.native
}

object Serializer {
  @scala.inline
  def apply(OrcSerDe: OrcSerDe = null, ParquetSerDe: ParquetSerDe = null): Serializer = {
    val __obj = js.Dynamic.literal()
    if (OrcSerDe != null) __obj.updateDynamic("OrcSerDe")(OrcSerDe.asInstanceOf[js.Any])
    if (ParquetSerDe != null) __obj.updateDynamic("ParquetSerDe")(ParquetSerDe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serializer]
  }
}

