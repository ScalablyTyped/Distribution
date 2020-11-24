package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.Height
import typings.std.DOMPoint
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Methods for customizing the behavior and appearance of an annotation callout.
  */
@js.native
trait AnnotationCalloutDelegate extends js.Object {
  
  /**
    * Returns a point determining the callout's anchor offset.
    */
  var calloutAnchorOffsetForAnnotation: js.UndefOr[js.Function2[/* annotation */ Annotation, /* size */ Height, DOMPoint]] = js.native
  
  /**
    * Returns a CSS animation used when the callout appears.
    */
  var calloutAppearanceAnimationForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, String]] = js.native
  
  /**
    * Returns custom content for the callout bubble.
    */
  var calloutContentForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  
  /**
    * Returns an element representing a custom callout.
    */
  var calloutElementForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  
  /**
    * Returns an element used as a custom accessory on the left side of the
    * callout content area.
    */
  var calloutLeftAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  
  /**
    * Returns an element used as a custom accessory on the right side of the
    * callout content area.
    */
  var calloutRightAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.native
  
  /**
    * Determines whether the callout should animate.
    */
  var calloutShouldAnimateForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.native
  
  /**
    * Determines whether the callout should appear for an annotation.
    */
  var calloutShouldAppearForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.native
}
object AnnotationCalloutDelegate {
  
  @scala.inline
  def apply(): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
  
  @scala.inline
  implicit class AnnotationCalloutDelegateOps[Self <: AnnotationCalloutDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalloutAnchorOffsetForAnnotation(value: (/* annotation */ Annotation, /* size */ Height) => DOMPoint): Self = this.set("calloutAnchorOffsetForAnnotation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalloutAnchorOffsetForAnnotation: Self = this.set("calloutAnchorOffsetForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutAppearanceAnimationForAnnotation(value: /* annotation */ Annotation => String): Self = this.set("calloutAppearanceAnimationForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutAppearanceAnimationForAnnotation: Self = this.set("calloutAppearanceAnimationForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutContentForAnnotation(value: /* annotation */ Annotation => Element): Self = this.set("calloutContentForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutContentForAnnotation: Self = this.set("calloutContentForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutElementForAnnotation(value: /* annotation */ Annotation => Element): Self = this.set("calloutElementForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutElementForAnnotation: Self = this.set("calloutElementForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutLeftAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = this.set("calloutLeftAccessoryForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutLeftAccessoryForAnnotation: Self = this.set("calloutLeftAccessoryForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutRightAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = this.set("calloutRightAccessoryForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutRightAccessoryForAnnotation: Self = this.set("calloutRightAccessoryForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutShouldAnimateForAnnotation(value: /* annotation */ Annotation => Boolean): Self = this.set("calloutShouldAnimateForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutShouldAnimateForAnnotation: Self = this.set("calloutShouldAnimateForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutShouldAppearForAnnotation(value: /* annotation */ Annotation => Boolean): Self = this.set("calloutShouldAppearForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalloutShouldAppearForAnnotation: Self = this.set("calloutShouldAppearForAnnotation", js.undefined)
  }
}
