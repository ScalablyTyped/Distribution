package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerAnnotationConstructorOptions extends AnnotationConstructorOptions {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var glyphColor: js.UndefOr[java.lang.String] = js.undefined
  var glyphImage: js.UndefOr[js.Any] = js.undefined
  var glyphText: js.UndefOr[java.lang.String] = js.undefined
  var selectedGlyphImage: js.UndefOr[js.Any] = js.undefined
  var subtitleVisibility: js.UndefOr[java.lang.String] = js.undefined
  var titleVisibility: js.UndefOr[java.lang.String] = js.undefined
}

object MarkerAnnotationConstructorOptions {
  @scala.inline
  def apply(
    accessibilityLabel: java.lang.String = null,
    anchorOffset: stdLib.DOMPoint = null,
    animates: js.UndefOr[scala.Boolean] = js.undefined,
    appearanceAnimation: java.lang.String = null,
    callout: AnnotationCalloutDelegate = null,
    calloutEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    calloutOffset: stdLib.DOMPoint = null,
    clusteringIdentifier: java.lang.String = null,
    collisionMode: java.lang.String = null,
    color: java.lang.String = null,
    data: js.Any = null,
    displayPriority: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    glyphColor: java.lang.String = null,
    glyphImage: js.Any = null,
    glyphText: java.lang.String = null,
    padding: Padding = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedGlyphImage: js.Any = null,
    size: js.Object = null,
    subtitle: java.lang.String = null,
    subtitleVisibility: java.lang.String = null,
    title: java.lang.String = null,
    titleVisibility: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): MarkerAnnotationConstructorOptions = {
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
    if (color != null) __obj.updateDynamic("color")(color)
    if (data != null) __obj.updateDynamic("data")(data)
    if (displayPriority != null) __obj.updateDynamic("displayPriority")(displayPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (glyphColor != null) __obj.updateDynamic("glyphColor")(glyphColor)
    if (glyphImage != null) __obj.updateDynamic("glyphImage")(glyphImage)
    if (glyphText != null) __obj.updateDynamic("glyphText")(glyphText)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedGlyphImage != null) __obj.updateDynamic("selectedGlyphImage")(selectedGlyphImage)
    if (size != null) __obj.updateDynamic("size")(size)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleVisibility != null) __obj.updateDynamic("subtitleVisibility")(subtitleVisibility)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleVisibility != null) __obj.updateDynamic("titleVisibility")(titleVisibility)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MarkerAnnotationConstructorOptions]
  }
}

