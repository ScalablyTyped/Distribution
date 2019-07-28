package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationConstructorOptions extends OverlayOptions {
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var anchorOffset: js.UndefOr[DOMPoint] = js.undefined
  var animates: js.UndefOr[Boolean] = js.undefined
  var appearanceAnimation: js.UndefOr[String] = js.undefined
  var callout: js.UndefOr[AnnotationCalloutDelegate] = js.undefined
  var calloutEnabled: js.UndefOr[Boolean] = js.undefined
  var calloutOffset: js.UndefOr[DOMPoint] = js.undefined
  var clusteringIdentifier: js.UndefOr[String] = js.undefined
  var collisionMode: js.UndefOr[String] = js.undefined
  var displayPriority: js.UndefOr[Double] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var size: js.UndefOr[js.Object] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnnotationConstructorOptions {
  @scala.inline
  def apply(
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
    padding: Padding = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    size: js.Object = null,
    subtitle: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
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
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (size != null) __obj.updateDynamic("size")(size)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
}

