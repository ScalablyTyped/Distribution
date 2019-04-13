package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deserializer extends js.Object {
  /**
    * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
    */
  var HiveJsonSerDe: js.UndefOr[HiveJsonSerDe] = js.undefined
  /**
    * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
    */
  var OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe] = js.undefined
}

object Deserializer {
  @scala.inline
  def apply(HiveJsonSerDe: HiveJsonSerDe = null, OpenXJsonSerDe: OpenXJsonSerDe = null): Deserializer = {
    val __obj = js.Dynamic.literal()
    if (HiveJsonSerDe != null) __obj.updateDynamic("HiveJsonSerDe")(HiveJsonSerDe)
    if (OpenXJsonSerDe != null) __obj.updateDynamic("OpenXJsonSerDe")(OpenXJsonSerDe)
    __obj.asInstanceOf[Deserializer]
  }
}

