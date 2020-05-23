package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.anon.Height
import typings.appleMapkitJs.anon.`1`
import typings.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing options for initializing an image annotation.
  */
trait ImageAnnotationConstructorOptions extends AnnotationConstructorOptions {
  /**
    * An object containing URLs for the image assets in multiple resolutions.
    */
  var url: `1`
}

object ImageAnnotationConstructorOptions {
  @scala.inline
  def apply(
    url: `1`,
    accessibilityLabel: String = null,
    anchorOffset: DOMPoint = null,
    animates: js.UndefOr[Boolean] = js.undefined,
    appearanceAnimation: String = null,
    callout: AnnotationCalloutDelegate = null,
    calloutEnabled: js.UndefOr[Boolean] = js.undefined,
    calloutOffset: DOMPoint = null,
    clusteringIdentifier: String = null,
    collisionMode: String = null,
    data: js.Any = null,
    displayPriority: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    size: Height = null,
    subtitle: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImageAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (anchorOffset != null) __obj.updateDynamic("anchorOffset")(anchorOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(animates)) __obj.updateDynamic("animates")(animates.get.asInstanceOf[js.Any])
    if (appearanceAnimation != null) __obj.updateDynamic("appearanceAnimation")(appearanceAnimation.asInstanceOf[js.Any])
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutEnabled)) __obj.updateDynamic("calloutEnabled")(calloutEnabled.get.asInstanceOf[js.Any])
    if (calloutOffset != null) __obj.updateDynamic("calloutOffset")(calloutOffset.asInstanceOf[js.Any])
    if (clusteringIdentifier != null) __obj.updateDynamic("clusteringIdentifier")(clusteringIdentifier.asInstanceOf[js.Any])
    if (collisionMode != null) __obj.updateDynamic("collisionMode")(collisionMode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(displayPriority)) __obj.updateDynamic("displayPriority")(displayPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnnotationConstructorOptions]
  }
}

