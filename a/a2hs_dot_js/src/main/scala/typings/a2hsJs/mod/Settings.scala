package typings.a2hsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Background color for container
    * @default '#f9f9f9'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Brand for default `htmlContent`
    * @default ''
    */
  var brandName: js.UndefOr[String] = js.undefined
  /**
    * Font color for content in container
    * @default '#5d5d5d'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Font family for content in container
    * @default '-apple-system, sans-serif'
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Font size for content in container
    * @default '0.9rem'
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * Content for container with HTML
    */
  var htmlContent: js.UndefOr[String] = js.undefined
  /**
    * Logo for container
    */
  var logoImage: js.UndefOr[String] = js.undefined
  /**
    * Padding for container
    * @default '10px'
    */
  var padding: js.UndefOr[String] = js.undefined
  /**
    * Shadow color for top of container
    * @default '#e9e9e9'
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Shadow size for top of container
    * @default '10px'
    */
  var shadowSize: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    brandName: String = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    htmlContent: String = null,
    logoImage: String = null,
    padding: String = null,
    shadowColor: String = null,
    shadowSize: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (brandName != null) __obj.updateDynamic("brandName")(brandName.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(htmlContent.asInstanceOf[js.Any])
    if (logoImage != null) __obj.updateDynamic("logoImage")(logoImage.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowSize != null) __obj.updateDynamic("shadowSize")(shadowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

