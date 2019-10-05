package typings.appleDashMapkitDashJs.mapkit

import typings.appleDashMapkitDashJs.Anon_1
import typings.appleDashMapkitDashJs.Anon_Height
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
  var url: Anon_1
}

object ImageAnnotationConstructorOptions {
  @scala.inline
  def apply(
    url: Anon_1,
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
    displayPriority: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    size: Anon_Height = null,
    subtitle: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImageAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (anchorOffset != null) __obj.updateDynamic("anchorOffset")(anchorOffset)
    if (!js.isUndefined(animates)) __obj.updateDynamic("animates")(animates)
    if (appearanceAnimation != null) __obj.updateDynamic("appearanceAnimation")(appearanceAnimation)
    if (callout != null) __obj.updateDynamic("callout")(callout)
    if (!js.isUndefined(calloutEnabled)) __obj.updateDynamic("calloutEnabled")(calloutEnabled)
    if (calloutOffset != null) __obj.updateDynamic("calloutOffset")(calloutOffset)
    if (clusteringIdentifier != null) __obj.updateDynamic("clusteringIdentifier")(clusteringIdentifier)
    if (collisionMode != null) __obj.updateDynamic("collisionMode")(collisionMode)
    if (data != null) __obj.updateDynamic("data")(data)
    if (displayPriority != null) __obj.updateDynamic("displayPriority")(displayPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (size != null) __obj.updateDynamic("size")(size)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ImageAnnotationConstructorOptions]
  }
}

