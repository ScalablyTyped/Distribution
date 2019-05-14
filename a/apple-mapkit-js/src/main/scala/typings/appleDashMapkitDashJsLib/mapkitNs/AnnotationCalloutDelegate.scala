package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationCalloutDelegate extends js.Object {
  def calloutAnchorOffsetForAnnotation(annotation: Annotation, size: appleDashMapkitDashJsLib.Anon_Height): stdLib.DOMPoint
  def calloutAppearanceAnimationForAnnotation(annotation: Annotation): java.lang.String
  def calloutContentForAnnotation(annotation: Annotation): stdLib.Element
  def calloutElementForAnnotation(annotation: Annotation): stdLib.Element
  def calloutLeftAccessoryForAnnotation(annotation: Annotation): stdLib.Element
  def calloutRightAccessoryForAnnotation(annotation: Annotation): stdLib.Element
  def calloutShouldAnimateForAnnotation(annotation: Annotation): scala.Boolean
  def calloutShouldAppearForAnnotation(annotation: Annotation): scala.Boolean
}

object AnnotationCalloutDelegate {
  @scala.inline
  def apply(
    calloutAnchorOffsetForAnnotation: (Annotation, appleDashMapkitDashJsLib.Anon_Height) => stdLib.DOMPoint,
    calloutAppearanceAnimationForAnnotation: Annotation => java.lang.String,
    calloutContentForAnnotation: Annotation => stdLib.Element,
    calloutElementForAnnotation: Annotation => stdLib.Element,
    calloutLeftAccessoryForAnnotation: Annotation => stdLib.Element,
    calloutRightAccessoryForAnnotation: Annotation => stdLib.Element,
    calloutShouldAnimateForAnnotation: Annotation => scala.Boolean,
    calloutShouldAppearForAnnotation: Annotation => scala.Boolean
  ): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal(calloutAnchorOffsetForAnnotation = js.Any.fromFunction2(calloutAnchorOffsetForAnnotation), calloutAppearanceAnimationForAnnotation = js.Any.fromFunction1(calloutAppearanceAnimationForAnnotation), calloutContentForAnnotation = js.Any.fromFunction1(calloutContentForAnnotation), calloutElementForAnnotation = js.Any.fromFunction1(calloutElementForAnnotation), calloutLeftAccessoryForAnnotation = js.Any.fromFunction1(calloutLeftAccessoryForAnnotation), calloutRightAccessoryForAnnotation = js.Any.fromFunction1(calloutRightAccessoryForAnnotation), calloutShouldAnimateForAnnotation = js.Any.fromFunction1(calloutShouldAnimateForAnnotation), calloutShouldAppearForAnnotation = js.Any.fromFunction1(calloutShouldAppearForAnnotation))
  
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
}

