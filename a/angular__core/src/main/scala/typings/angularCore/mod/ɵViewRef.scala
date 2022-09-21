package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275ViewRef")
@js.native
open class ɵViewRef[T] protected ()
  extends EmbeddedViewRef[T]
     with InternalViewRef {
  def this(/**
    * This represents `LView` associated with the component when ViewRef is a ChangeDetectorRef.
    *
    * When ViewRef is created for a dynamic component, this also represents the `LView` for the
    * component.
    *
    * For a "regular" ViewRef created for an embedded view, this is the `LView` for the embedded
    * view.
    *
    * @internal
    */
  _lView: LView[Any]) = this()
  def this(
    /**
    * This represents `LView` associated with the component when ViewRef is a ChangeDetectorRef.
    *
    * When ViewRef is created for a dynamic component, this also represents the `LView` for the
    * component.
    *
    * For a "regular" ViewRef created for an embedded view, this is the `LView` for the embedded
    * view.
    *
    * @internal
    */
  _lView: LView[Any],
    /**
    * This represents the `LView` associated with the point where `ChangeDetectorRef` was
    * requested.
    *
    * This may be different from `_lView` if the `_cdRefInjectingView` is an embedded view.
    */
  _cdRefInjectingView: LView[Any]
  ) = this()
  
  /* private */ var _appRef: Any = js.native
  
  /* private */ var _attachedToViewContainer: Any = js.native
  
  /**
    * This represents the `LView` associated with the point where `ChangeDetectorRef` was
    * requested.
    *
    * This may be different from `_lView` if the `_cdRefInjectingView` is an embedded view.
    */
  /* private */ var _cdRefInjectingView: Any = js.native
  
  def attachToViewContainerRef(): Unit = js.native
  
  @JSName("context")
  def context_MɵViewRef: T = js.native
}
