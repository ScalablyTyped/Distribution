package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.Height
import typings.std.DOMPoint
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base annotation object, used for creating custom annotations.
  */
@js.native
trait Annotation extends StObject {
  
  /**
    * Adds an event listener to handle events triggered by user interactions
    * with annotations.
    *
    * @param type The event type of interest (e.g., "select").
    * @param listener The callback function to invoke. listener is passed an
    * annotation event as its sole argument.
    * @param thisObject An object to be set as the this keyword on the
    * listener function.
    */
  def addEventListener[T](
    `type`: AnnotationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[Map], Unit]
  ): Unit = js.native
  def addEventListener[T](
    `type`: AnnotationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[Map], Unit],
    thisObject: T
  ): Unit = js.native
  
  /**
    * An offset that changes the annotation's default anchor point.
    */
  var anchorOffset: DOMPoint = js.native
  
  /**
    * A Boolean value that determines if the annotation should be animated.
    */
  var animates: Boolean = js.native
  
  /**
    * A CSS animation that runs when the annotation appears on the map.
    */
  var appearanceAnimation: String = js.native
  
  /**
    * A delegate that enables you to customize the annotation's callout.
    */
  var callout: AnnotationCalloutDelegate = js.native
  
  /**
    * A Boolean value that determines whether a callout should be shown.
    */
  var calloutEnabled: Boolean = js.native
  
  /**
    * An offset that changes the annotation callout's default placement.
    */
  var calloutOffset: DOMPoint = js.native
  
  /**
    * An identifer used for grouping annotations into the same cluster.
    */
  var clusteringIdentifier: String | Null = js.native
  
  /**
    * A mode that determines the shape of the collision frame.
    */
  var collisionMode: String = js.native
  
  /**
    * The annotation's coordinate.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * Data that you define that is assigned to the annotation.
    */
  var data: js.Any = js.native
  
  /**
    * A numeric hint the map uses to prioritize displaying annotations.
    */
  var displayPriority: Double = js.native
  
  /**
    * A Boolean value that determines whether the user can drag the annotation.
    */
  var draggable: Boolean = js.native
  
  /**
    * The annotation's element in the DOM.
    */
  val element: Element = js.native
  
  /**
    * A Boolean value that determines whether the annotation responds to user
    * interaction.
    */
  var enabled: Boolean = js.native
  
  /**
    * The map to which the annotation was added.
    */
  val map: Map | Null = js.native
  
  /**
    * An array of annotations that are grouped together in a cluster.
    */
  var memberAnnotations: js.Array[Annotation] = js.native
  
  /**
    * Spacing added around the annotation when showing items.
    */
  var padding: Padding = js.native
  
  /**
    * Adds an event listener to handle events triggered by user interactions
    * with annotations.
    *
    * @param type The event type of interest (e.g., "select").
    * @param listener The callback function to remove.
    * @param thisObject An object to be set as the this keyword on the listener
    * function.
    */
  def removeEventListener[T](
    `type`: AnnotationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[Map], Unit]
  ): Unit = js.native
  def removeEventListener[T](
    `type`: AnnotationEventType,
    listener: js.ThisFunction1[/* this */ T, /* event */ EventBase[Map], Unit],
    thisObject: T
  ): Unit = js.native
  
  /**
    * A Boolean value that determines whether the annotation is selected.
    */
  var selected: Boolean = js.native
  
  /**
    * The desired dimensions of the annotation, in CSS pixels.
    */
  var size: Height = js.native
  
  /**
    * The text to display as a subtitle, on the second line of an annotation's
    * callout.
    */
  var subtitle: String = js.native
  
  /**
    * The text to display in the annotation's callout.
    */
  var title: String = js.native
  
  /**
    * A Boolean value that determines if the annotation is visible or hidden.
    */
  var visible: Boolean = js.native
}
