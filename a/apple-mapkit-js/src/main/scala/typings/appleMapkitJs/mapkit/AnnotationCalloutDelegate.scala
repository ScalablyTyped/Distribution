package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.AnonHeight
import typings.std.DOMPoint
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods for customizing the behavior and appearance of an annotation callout.
  */
trait AnnotationCalloutDelegate extends js.Object {
  /**
    * Returns a point determining the callout's anchor offset.
    */
  var calloutAnchorOffsetForAnnotation: js.UndefOr[js.Function2[/* annotation */ Annotation, /* size */ AnonHeight, DOMPoint]] = js.undefined
  /**
    * Returns a CSS animation used when the callout appears.
    */
  var calloutAppearanceAnimationForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, String]] = js.undefined
  /**
    * Returns custom content for the callout bubble.
    */
  var calloutContentForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element representing a custom callout.
    */
  var calloutElementForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element used as a custom accessory on the left side of the
    * callout content area.
    */
  var calloutLeftAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element used as a custom accessory on the right side of the
    * callout content area.
    */
  var calloutRightAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Determines whether the callout should animate.
    */
  var calloutShouldAnimateForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.undefined
  /**
    * Determines whether the callout should appear for an annotation.
    */
  var calloutShouldAppearForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.undefined
}

object AnnotationCalloutDelegate {
  @scala.inline
  def apply(
    calloutAnchorOffsetForAnnotation: (/* annotation */ Annotation, /* size */ AnonHeight) => DOMPoint = null,
    calloutAppearanceAnimationForAnnotation: /* annotation */ Annotation => String = null,
    calloutContentForAnnotation: /* annotation */ Annotation => Element = null,
    calloutElementForAnnotation: /* annotation */ Annotation => Element = null,
    calloutLeftAccessoryForAnnotation: /* annotation */ Annotation => Element = null,
    calloutRightAccessoryForAnnotation: /* annotation */ Annotation => Element = null,
    calloutShouldAnimateForAnnotation: /* annotation */ Annotation => Boolean = null,
    calloutShouldAppearForAnnotation: /* annotation */ Annotation => Boolean = null
  ): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal()
    if (calloutAnchorOffsetForAnnotation != null) __obj.updateDynamic("calloutAnchorOffsetForAnnotation")(js.Any.fromFunction2(calloutAnchorOffsetForAnnotation))
    if (calloutAppearanceAnimationForAnnotation != null) __obj.updateDynamic("calloutAppearanceAnimationForAnnotation")(js.Any.fromFunction1(calloutAppearanceAnimationForAnnotation))
    if (calloutContentForAnnotation != null) __obj.updateDynamic("calloutContentForAnnotation")(js.Any.fromFunction1(calloutContentForAnnotation))
    if (calloutElementForAnnotation != null) __obj.updateDynamic("calloutElementForAnnotation")(js.Any.fromFunction1(calloutElementForAnnotation))
    if (calloutLeftAccessoryForAnnotation != null) __obj.updateDynamic("calloutLeftAccessoryForAnnotation")(js.Any.fromFunction1(calloutLeftAccessoryForAnnotation))
    if (calloutRightAccessoryForAnnotation != null) __obj.updateDynamic("calloutRightAccessoryForAnnotation")(js.Any.fromFunction1(calloutRightAccessoryForAnnotation))
    if (calloutShouldAnimateForAnnotation != null) __obj.updateDynamic("calloutShouldAnimateForAnnotation")(js.Any.fromFunction1(calloutShouldAnimateForAnnotation))
    if (calloutShouldAppearForAnnotation != null) __obj.updateDynamic("calloutShouldAppearForAnnotation")(js.Any.fromFunction1(calloutShouldAppearForAnnotation))
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
}

