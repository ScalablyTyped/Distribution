package typings.appleMapkitJsBrowser

import typings.appleMapkitJsBrowser.mapkit.AnnotationEventType
import typings.appleMapkitJsBrowser.mapkit.InitializationEventType
import typings.appleMapkitJsBrowser.mapkit.OverlayEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appleMapkitJsBrowserStrings {
  
  @scala.inline
  def Initialized: Initialized = "Initialized".asInstanceOf[Initialized]
  
  @scala.inline
  def Refreshed: Refreshed = "Refreshed".asInstanceOf[Refreshed]
  
  @scala.inline
  def `Too Many Requests`: `Too Many Requests` = ("Too Many Requests").asInstanceOf[`Too Many Requests`]
  
  @scala.inline
  def Unauthorized: Unauthorized = "Unauthorized".asInstanceOf[Unauthorized]
  
  @scala.inline
  def `configuration-change`: `configuration-change` = "configuration-change".asInstanceOf[`configuration-change`]
  
  @scala.inline
  def deselect: deselect = "deselect".asInstanceOf[deselect]
  
  @scala.inline
  def `double-tap`: `double-tap` = "double-tap".asInstanceOf[`double-tap`]
  
  @scala.inline
  def `drag-end`: `drag-end` = "drag-end".asInstanceOf[`drag-end`]
  
  @scala.inline
  def `drag-start`: `drag-start` = "drag-start".asInstanceOf[`drag-start`]
  
  @scala.inline
  def dragging: dragging = "dragging".asInstanceOf[dragging]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def `long-press`: `long-press` = "long-press".asInstanceOf[`long-press`]
  
  @scala.inline
  def `map-type-change`: `map-type-change` = "map-type-change".asInstanceOf[`map-type-change`]
  
  @scala.inline
  def `region-change-end`: `region-change-end` = "region-change-end".asInstanceOf[`region-change-end`]
  
  @scala.inline
  def `region-change-start`: `region-change-start` = "region-change-start".asInstanceOf[`region-change-start`]
  
  @scala.inline
  def `scroll-end`: `scroll-end` = "scroll-end".asInstanceOf[`scroll-end`]
  
  @scala.inline
  def `scroll-start`: `scroll-start` = "scroll-start".asInstanceOf[`scroll-start`]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def `single-tap`: `single-tap` = "single-tap".asInstanceOf[`single-tap`]
  
  @scala.inline
  def `user-location-change`: `user-location-change` = "user-location-change".asInstanceOf[`user-location-change`]
  
  @scala.inline
  def `user-location-error`: `user-location-error` = "user-location-error".asInstanceOf[`user-location-error`]
  
  @scala.inline
  def `zoom-end`: `zoom-end` = "zoom-end".asInstanceOf[`zoom-end`]
  
  @scala.inline
  def `zoom-start`: `zoom-start` = "zoom-start".asInstanceOf[`zoom-start`]
  
  @js.native
  sealed trait Initialized extends js.Object
  
  @js.native
  sealed trait Refreshed extends js.Object
  
  @js.native
  sealed trait `Too Many Requests` extends js.Object
  
  @js.native
  sealed trait Unauthorized extends js.Object
  
  @js.native
  sealed trait `configuration-change` extends InitializationEventType
  
  @js.native
  sealed trait deselect
    extends AnnotationEventType
       with OverlayEventType
  
  @js.native
  sealed trait `double-tap` extends js.Object
  
  @js.native
  sealed trait `drag-end` extends AnnotationEventType
  
  @js.native
  sealed trait `drag-start` extends AnnotationEventType
  
  @js.native
  sealed trait dragging extends AnnotationEventType
  
  @js.native
  sealed trait error extends InitializationEventType
  
  @js.native
  sealed trait `long-press` extends js.Object
  
  @js.native
  sealed trait `map-type-change` extends js.Object
  
  @js.native
  sealed trait `region-change-end` extends js.Object
  
  @js.native
  sealed trait `region-change-start` extends js.Object
  
  @js.native
  sealed trait `scroll-end` extends js.Object
  
  @js.native
  sealed trait `scroll-start` extends js.Object
  
  @js.native
  sealed trait select
    extends AnnotationEventType
       with OverlayEventType
  
  @js.native
  sealed trait `single-tap` extends js.Object
  
  @js.native
  sealed trait `user-location-change` extends js.Object
  
  @js.native
  sealed trait `user-location-error` extends js.Object
  
  @js.native
  sealed trait `zoom-end` extends js.Object
  
  @js.native
  sealed trait `zoom-start` extends js.Object
}
