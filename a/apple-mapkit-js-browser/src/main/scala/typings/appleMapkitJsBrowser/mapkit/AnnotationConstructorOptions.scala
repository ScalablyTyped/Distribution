package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.Height
import typings.std.DOMPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains options for initializing annotation features.
  */
trait AnnotationConstructorOptions extends StObject {
  
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
  var data: js.UndefOr[Any] = js.undefined
  
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
    * Spacing added around the annotation when showing items.
    */
  var padding: js.UndefOr[Padding] = js.undefined
  
  /**
    * A Boolean value that determines whether the annotation is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The desired dimensions of the annotation, in CSS pixels.
    */
  var size: js.UndefOr[Height] = js.undefined
  
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
  
  inline def apply(): AnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationConstructorOptions]
  }
  
  extension [Self <: AnnotationConstructorOptions](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAnchorOffset(value: DOMPoint): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    inline def setAnimates(value: Boolean): Self = StObject.set(x, "animates", value.asInstanceOf[js.Any])
    
    inline def setAnimatesUndefined: Self = StObject.set(x, "animates", js.undefined)
    
    inline def setAppearanceAnimation(value: String): Self = StObject.set(x, "appearanceAnimation", value.asInstanceOf[js.Any])
    
    inline def setAppearanceAnimationUndefined: Self = StObject.set(x, "appearanceAnimation", js.undefined)
    
    inline def setCallout(value: AnnotationCalloutDelegate): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutEnabled(value: Boolean): Self = StObject.set(x, "calloutEnabled", value.asInstanceOf[js.Any])
    
    inline def setCalloutEnabledUndefined: Self = StObject.set(x, "calloutEnabled", js.undefined)
    
    inline def setCalloutOffset(value: DOMPoint): Self = StObject.set(x, "calloutOffset", value.asInstanceOf[js.Any])
    
    inline def setCalloutOffsetUndefined: Self = StObject.set(x, "calloutOffset", js.undefined)
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setClusteringIdentifier(value: String): Self = StObject.set(x, "clusteringIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusteringIdentifierUndefined: Self = StObject.set(x, "clusteringIdentifier", js.undefined)
    
    inline def setCollisionMode(value: String): Self = StObject.set(x, "collisionMode", value.asInstanceOf[js.Any])
    
    inline def setCollisionModeUndefined: Self = StObject.set(x, "collisionMode", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisplayPriority(value: Double): Self = StObject.set(x, "displayPriority", value.asInstanceOf[js.Any])
    
    inline def setDisplayPriorityUndefined: Self = StObject.set(x, "displayPriority", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
