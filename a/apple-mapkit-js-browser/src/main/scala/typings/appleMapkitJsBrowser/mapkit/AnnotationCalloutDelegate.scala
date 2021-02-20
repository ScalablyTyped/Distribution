package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.Height
import typings.std.DOMPoint
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Methods for customizing the behavior and appearance of an annotation callout.
  */
@js.native
trait AnnotationCalloutDelegate extends StObject {
  
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
  implicit class AnnotationCalloutDelegateMutableBuilder[Self <: AnnotationCalloutDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutAnchorOffsetForAnnotation(value: (/* annotation */ Annotation, /* size */ Height) => DOMPoint): Self = StObject.set(x, "calloutAnchorOffsetForAnnotation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalloutAnchorOffsetForAnnotationUndefined: Self = StObject.set(x, "calloutAnchorOffsetForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutAppearanceAnimationForAnnotation(value: /* annotation */ Annotation => String): Self = StObject.set(x, "calloutAppearanceAnimationForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutAppearanceAnimationForAnnotationUndefined: Self = StObject.set(x, "calloutAppearanceAnimationForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutContentForAnnotation(value: /* annotation */ Annotation => Element): Self = StObject.set(x, "calloutContentForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutContentForAnnotationUndefined: Self = StObject.set(x, "calloutContentForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutElementForAnnotation(value: /* annotation */ Annotation => Element): Self = StObject.set(x, "calloutElementForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutElementForAnnotationUndefined: Self = StObject.set(x, "calloutElementForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutLeftAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = StObject.set(x, "calloutLeftAccessoryForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutLeftAccessoryForAnnotationUndefined: Self = StObject.set(x, "calloutLeftAccessoryForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutRightAccessoryForAnnotation(value: /* annotation */ Annotation => Element): Self = StObject.set(x, "calloutRightAccessoryForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutRightAccessoryForAnnotationUndefined: Self = StObject.set(x, "calloutRightAccessoryForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutShouldAnimateForAnnotation(value: /* annotation */ Annotation => Boolean): Self = StObject.set(x, "calloutShouldAnimateForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutShouldAnimateForAnnotationUndefined: Self = StObject.set(x, "calloutShouldAnimateForAnnotation", js.undefined)
    
    @scala.inline
    def setCalloutShouldAppearForAnnotation(value: /* annotation */ Annotation => Boolean): Self = StObject.set(x, "calloutShouldAppearForAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalloutShouldAppearForAnnotationUndefined: Self = StObject.set(x, "calloutShouldAppearForAnnotation", js.undefined)
  }
}
