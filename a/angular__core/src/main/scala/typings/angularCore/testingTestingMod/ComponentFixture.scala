package typings.angularCore.testingTestingMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.DebugElement
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/testing/testing", "ComponentFixture")
@js.native
class ComponentFixture[T] protected () extends js.Object {
  def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
  def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
  
  var _autoDetect: js.Any = js.native
  
  var _getRenderer: js.Any = js.native
  
  var _isDestroyed: js.Any = js.native
  
  var _isStable: js.Any = js.native
  
  var _onErrorSubscription: js.Any = js.native
  
  var _onMicrotaskEmptySubscription: js.Any = js.native
  
  var _onStableSubscription: js.Any = js.native
  
  var _onUnstableSubscription: js.Any = js.native
  
  var _promise: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  var _resolve: js.Any = js.native
  
  var _tick: js.Any = js.native
  
  /**
    * Set whether the fixture should autodetect changes.
    *
    * Also runs detectChanges once so that any existing change is detected.
    */
  def autoDetectChanges(): Unit = js.native
  def autoDetectChanges(autoDetect: Boolean): Unit = js.native
  
  /**
    * The ChangeDetectorRef for the component
    */
  var changeDetectorRef: ChangeDetectorRef = js.native
  
  /**
    * Do a change detection run to make sure there were no changes.
    */
  def checkNoChanges(): Unit = js.native
  
  /**
    * The instance of the root component class.
    */
  var componentInstance: T = js.native
  
  var componentRef: ComponentRef[T] = js.native
  
  /**
    * The DebugElement associated with the root element of this component.
    */
  var debugElement: DebugElement = js.native
  
  /**
    * Trigger component destruction.
    */
  def destroy(): Unit = js.native
  
  /**
    * Trigger a change detection cycle for the component.
    */
  def detectChanges(): Unit = js.native
  def detectChanges(checkNoChanges: Boolean): Unit = js.native
  
  /**
    * The ElementRef for the element at the root of the component.
    */
  var elementRef: ElementRef[_] = js.native
  
  /**
    * Return whether the fixture is currently stable or has async tasks that have not been completed
    * yet.
    */
  def isStable(): Boolean = js.native
  
  /**
    * The native element at the root of the component.
    */
  var nativeElement: js.Any = js.native
  
  var ngZone: NgZone | Null = js.native
  
  /**
    * Get a promise that resolves when the ui state is stable following animations.
    */
  def whenRenderingDone(): js.Promise[_] = js.native
  
  /**
    * Get a promise that resolves when the fixture is stable.
    *
    * This can be used to resume testing after events have triggered asynchronous activity or
    * asynchronous change detection.
    */
  def whenStable(): js.Promise[_] = js.native
}
