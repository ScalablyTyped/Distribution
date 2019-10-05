package typings.appleDashMapkitDashJs.mapkit

import typings.appleDashMapkitDashJs.Anon_Height
import typings.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains options for initializing annotation features.
  */
trait AnnotationConstructorOptions extends js.Object {
  /**
    * Accessibility text for the annotation.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  /**
    * The offset in CSS pixels of the element from the bottom center.
    */
  var anchorOffset: js.UndefOr[DOMPoint] = js.undefined
  /**
    * A Boolean value that determines if the annotation should be animated.
    */
  var animates: js.UndefOr[Boolean] = js.undefined
  /**
    * A CSS animation that runs when the annotation appears on the map.
    */
  var appearanceAnimation: js.UndefOr[String] = js.undefined
  /**
    * A delegate that enables you to customize the annotation's callout.
    */
  var callout: js.UndefOr[AnnotationCalloutDelegate] = js.undefined
  /**
    * A Boolean value that determines whether a callout should be shown.
    */
  var calloutEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The offset in CSS pixels of a callout from the top center of the element.
    */
  var calloutOffset: js.UndefOr[DOMPoint] = js.undefined
  /**
    * An identifer used for grouping annotations into the same cluster.
    */
  var clusteringIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A mode that determines the shape of the collision frame.
    */
  var collisionMode: js.UndefOr[String] = js.undefined
  /**
    * Data you define that is assigned to the annotation.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * A hint the map uses to prioritize displaying the annotation.
    */
  var displayPriority: js.UndefOr[Double] = js.undefined
  /**
    * A Boolean value that determines whether the user can drag the annotation.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the annotation responds to user
    * interaction.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines whether the annotation is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The desired dimensions of the annotation, in CSS pixels.
    */
  var size: js.UndefOr[Anon_Height] = js.undefined
  /**
    * The text to display as a subtitle on the second line of an annotation's
    * callout.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * The text to display in the annotation's callout.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value that determines if the annotation is visible or hidden.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
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
    selected: js.UndefOr[Boolean] = js.undefined,
    size: Anon_Height = null,
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
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (size != null) __obj.updateDynamic("size")(size)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
}

