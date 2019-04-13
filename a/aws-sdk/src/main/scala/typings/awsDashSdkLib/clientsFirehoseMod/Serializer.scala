package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[OrcSerDe] = js.undefined
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[ParquetSerDe] = js.undefined
}

object Serializer {
  @scala.inline
  def apply(OrcSerDe: OrcSerDe = null, ParquetSerDe: ParquetSerDe = null): Serializer = {
    val __obj = js.Dynamic.literal()
    if (OrcSerDe != null) __obj.updateDynamic("OrcSerDe")(OrcSerDe)
    if (ParquetSerDe != null) __obj.updateDynamic("ParquetSerDe")(ParquetSerDe)
    __obj.asInstanceOf[Serializer]
  }
}

