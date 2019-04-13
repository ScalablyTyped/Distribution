package typings
package awsDashSdkLib.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericAttachment extends js.Object {
  /**
    * The URL of an attachment to the response card.
    */
  var attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.undefined
  /**
    * The list of options to show to the user.
    */
  var buttons: js.UndefOr[listOfButtons] = js.undefined
  /**
    * The URL of an image that is displayed to the user.
    */
  var imageUrl: js.UndefOr[StringUrlWithLength] = js.undefined
  /**
    * The subtitle shown below the title.
    */
  var subTitle: js.UndefOr[StringWithLength] = js.undefined
  /**
    * The title of the option.
    */
  var title: js.UndefOr[StringWithLength] = js.undefined
}

object GenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: StringUrlWithLength = null,
    buttons: listOfButtons = null,
    imageUrl: StringUrlWithLength = null,
    subTitle: StringWithLength = null,
    title: StringWithLength = null
  ): GenericAttachment = {
    val __obj = js.Dynamic.literal()
    if (attachmentLinkUrl != null) __obj.updateDynamic("attachmentLinkUrl")(attachmentLinkUrl)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GenericAttachment]
  }
}

