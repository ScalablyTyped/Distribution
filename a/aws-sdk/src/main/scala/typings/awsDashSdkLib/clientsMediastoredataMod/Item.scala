package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * The length of the item in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
  /**
    * The content type of the item.
    */
  var ContentType: js.UndefOr[ContentType] = js.undefined
  /**
    * The ETag that represents a unique instance of the item.
    */
  var ETag: js.UndefOr[ETag] = js.undefined
  /**
    * The date and time that the item was last modified.
    */
  var LastModified: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The name of the item.
    */
  var Name: js.UndefOr[ItemName] = js.undefined
  /**
    * The item type (folder or object).
    */
  var Type: js.UndefOr[ItemType] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
    ContentType: ContentType = null,
    ETag: ETag = null,
    LastModified: TimeStamp = null,
    Name: ItemName = null,
    Type: ItemType = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

