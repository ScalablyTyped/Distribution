package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMetadataResult extends js.Object {
  /**
    * The number of unique attribute names in the domain.
    */
  var AttributeNameCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all unique attribute names in the domain, in bytes.
    */
  var AttributeNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all attribute name/value pairs in the domain.
    */
  var AttributeValueCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all attribute values in the domain, in bytes.
    */
  var AttributeValuesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The number of all items in the domain.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  /**
    * The total size of all item names in the domain, in bytes.
    */
  var ItemNamesSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
    */
  var Timestamp: js.UndefOr[Integer] = js.native
}

object DomainMetadataResult {
  @scala.inline
  def apply(
    AttributeNameCount: Int | Double = null,
    AttributeNamesSizeBytes: Int | Double = null,
    AttributeValueCount: Int | Double = null,
    AttributeValuesSizeBytes: Int | Double = null,
    ItemCount: Int | Double = null,
    ItemNamesSizeBytes: Int | Double = null,
    Timestamp: Int | Double = null
  ): DomainMetadataResult = {
    val __obj = js.Dynamic.literal()
    if (AttributeNameCount != null) __obj.updateDynamic("AttributeNameCount")(AttributeNameCount.asInstanceOf[js.Any])
    if (AttributeNamesSizeBytes != null) __obj.updateDynamic("AttributeNamesSizeBytes")(AttributeNamesSizeBytes.asInstanceOf[js.Any])
    if (AttributeValueCount != null) __obj.updateDynamic("AttributeValueCount")(AttributeValueCount.asInstanceOf[js.Any])
    if (AttributeValuesSizeBytes != null) __obj.updateDynamic("AttributeValuesSizeBytes")(AttributeValuesSizeBytes.asInstanceOf[js.Any])
    if (ItemCount != null) __obj.updateDynamic("ItemCount")(ItemCount.asInstanceOf[js.Any])
    if (ItemNamesSizeBytes != null) __obj.updateDynamic("ItemNamesSizeBytes")(ItemNamesSizeBytes.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMetadataResult]
  }
}

