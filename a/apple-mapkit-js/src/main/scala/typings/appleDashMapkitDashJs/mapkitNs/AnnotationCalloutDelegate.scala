package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.Anon_Height
import typings.std.DOMPoint
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationCalloutDelegate extends js.Object {
  def calloutAnchorOffsetForAnnotation(annotation: Annotation, size: Anon_Height): DOMPoint
  def calloutAppearanceAnimationForAnnotation(annotation: Annotation): String
  def calloutContentForAnnotation(annotation: Annotation): Element
  def calloutElementForAnnotation(annotation: Annotation): Element
  def calloutLeftAccessoryForAnnotation(annotation: Annotation): Element
  def calloutRightAccessoryForAnnotation(annotation: Annotation): Element
  def calloutShouldAnimateForAnnotation(annotation: Annotation): Boolean
  def calloutShouldAppearForAnnotation(annotation: Annotation): Boolean
}

object AnnotationCalloutDelegate {
  @scala.inline
  def apply(
    calloutAnchorOffsetForAnnotation: (Annotation, Anon_Height) => DOMPoint,
    calloutAppearanceAnimationForAnnotation: Annotation => String,
    calloutContentForAnnotation: Annotation => Element,
    calloutElementForAnnotation: Annotation => Element,
    calloutLeftAccessoryForAnnotation: Annotation => Element,
    calloutRightAccessoryForAnnotation: Annotation => Element,
    calloutShouldAnimateForAnnotation: Annotation => Boolean,
    calloutShouldAppearForAnnotation: Annotation => Boolean
  ): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal(calloutAnchorOffsetForAnnotation = js.Any.fromFunction2(calloutAnchorOffsetForAnnotation), calloutAppearanceAnimationForAnnotation = js.Any.fromFunction1(calloutAppearanceAnimationForAnnotation), calloutContentForAnnotation = js.Any.fromFunction1(calloutContentForAnnotation), calloutElementForAnnotation = js.Any.fromFunction1(calloutElementForAnnotation), calloutLeftAccessoryForAnnotation = js.Any.fromFunction1(calloutLeftAccessoryForAnnotation), calloutRightAccessoryForAnnotation = js.Any.fromFunction1(calloutRightAccessoryForAnnotation), calloutShouldAnimateForAnnotation = js.Any.fromFunction1(calloutShouldAnimateForAnnotation), calloutShouldAppearForAnnotation = js.Any.fromFunction1(calloutShouldAppearForAnnotation))
  
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
}

