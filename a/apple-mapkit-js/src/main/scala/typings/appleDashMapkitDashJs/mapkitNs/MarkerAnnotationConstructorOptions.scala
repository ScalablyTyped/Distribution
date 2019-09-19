package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.Anon_1
import typings.appleDashMapkitDashJs.Anon_Height
import typings.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the options that initialize a marker annotation.
  */
trait MarkerAnnotationConstructorOptions extends AnnotationConstructorOptions {
  /**
    * The background color of the balloon.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The fill color of the glyph.
    */
  var glyphColor: js.UndefOr[String] = js.undefined
  /**
    * The image to display in the marker balloon.
    */
  var glyphImage: js.UndefOr[Anon_1] = js.undefined
  /**
    * The text to display in the marker balloon.
    */
  var glyphText: js.UndefOr[String] = js.undefined
  /**
    * The image to display in the balloon when the marker is selected.
    */
  var selectedGlyphImage: js.UndefOr[js.Object] = js.undefined
  /**
    * A value that determines the behavior of the subtitle's visibility.
    */
  var subtitleVisibility: js.UndefOr[String] = js.undefined
  /**
    * A value that determines the behavior of the title's visibility.
    */
  var titleVisibility: js.UndefOr[String] = js.undefined
}

object MarkerAnnotationConstructorOptions {
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
    color: String = null,
    data: js.Any = null,
    displayPriority: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    glyphColor: String = null,
    glyphImage: Anon_1 = null,
    glyphText: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedGlyphImage: js.Object = null,
    size: Anon_Height = null,
    subtitle: String = null,
    subtitleVisibility: String = null,
    title: String = null,
    titleVisibility: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

