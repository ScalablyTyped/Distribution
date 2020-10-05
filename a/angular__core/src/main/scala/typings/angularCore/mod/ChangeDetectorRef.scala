package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ChangeDetectorRef")
@js.native
abstract class ChangeDetectorRef () extends js.Object {
  /**
    * Checks the change detector and its children, and throws if any changes are detected.
    *
    * Use in development mode to verify that running change detection doesn't introduce
    * other changes.
    */
  def checkNoChanges(): Unit = js.native
  /**
    * Detaches this view from the change-detection tree.
    * A detached view is  not checked until it is reattached.
    * Use in combination with `detectChanges()` to implement local change detection checks.
    *
    * Detached views are not checked during change detection runs until they are
    * re-attached, even if they are marked as dirty.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detach(): Unit = js.native
  /**
    * Checks this view and its children. Use in combination with {@link ChangeDetectorRef#detach
    * detach}
    * to implement local change detection checks.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    * <!-- TODO: Add a live demo once ref.detectChanges is merged into master -->
    *
    */
  def detectChanges(): Unit = js.native
  /**
    * When a view uses the {@link ChangeDetectionStrategy#OnPush OnPush} (checkOnce)
    * change detection strategy, explicitly marks the view as changed so that
    * it can be checked again.
    *
    * Components are normally marked as dirty (in need of rerendering) when inputs
    * have changed or events have fired in the view. Call this method to ensure that
    * a component is checked even if these triggers have not occured.
    *
    * <!-- TODO: Add a link to a chapter on OnPush components -->
    *
    */
  def markForCheck(): Unit = js.native
  /**
    * Re-attaches the previously detached view to the change detection tree.
    * Views are attached to the tree by default.
    *
    * <!-- TODO: Add a link to a chapter on detach/reattach/local digest -->
    *
    */
  def reattach(): Unit = js.native
}

