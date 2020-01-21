package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.AnonHeight
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
  var size: js.UndefOr[AnonHeight] = js.undefined
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
    size: AnonHeight = null,
    subtitle: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (anchorOffset != null) __obj.updateDynamic("anchorOffset")(anchorOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(animates)) __obj.updateDynamic("animates")(animates.asInstanceOf[js.Any])
    if (appearanceAnimation != null) __obj.updateDynamic("appearanceAnimation")(appearanceAnimation.asInstanceOf[js.Any])
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutEnabled)) __obj.updateDynamic("calloutEnabled")(calloutEnabled.asInstanceOf[js.Any])
    if (calloutOffset != null) __obj.updateDynamic("calloutOffset")(calloutOffset.asInstanceOf[js.Any])
    if (clusteringIdentifier != null) __obj.updateDynamic("clusteringIdentifier")(clusteringIdentifier.asInstanceOf[js.Any])
    if (collisionMode != null) __obj.updateDynamic("collisionMode")(collisionMode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayPriority != null) __obj.updateDynamic("displayPriority")(displayPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
}

