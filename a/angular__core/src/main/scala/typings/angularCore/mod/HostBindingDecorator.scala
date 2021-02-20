package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostBindingDecorator
  extends Instantiable0[js.Any]
     with Instantiable1[/* bindingPropertyName */ String, js.Any] {
  
  /**
    * Decorator that marks a DOM property as a host-binding property and supplies configuration
    * metadata.
    * Angular automatically checks host property bindings during change detection, and
    * if a binding changes it updates the host element of the directive.
    *
    * @usageNotes
    *
    * The following example creates a directive that sets the `valid` and `invalid`
    * properties on the DOM element that has an `ngModel` directive on it.
    *
    * ```typescript
    * @Directive({selector: '[ngModel]'})
    * class NgModelStatus {
    *   constructor(public control: NgModel) {}
    *   @HostBinding('class.valid') get valid() { return this.control.valid; }
    *   @HostBinding('class.invalid') get invalid() { return this.control.invalid; }
    * }
    *
    * @Component({
    *   selector: 'app',
    *   template: `<input [(ngModel)]="prop">`,
    * })
    * class App {
    *   prop;
    * }
    * ```
    *
    */
  def apply(): js.Any = js.native
  def apply(hostPropertyName: String): js.Any = js.native
}
