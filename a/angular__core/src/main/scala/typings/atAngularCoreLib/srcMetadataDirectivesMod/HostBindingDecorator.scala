package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostBindingDecorator
  extends org.scalablytyped.runtime.Instantiable0[js.Any]
     with org.scalablytyped.runtime.Instantiable1[/* hostPropertyName */ java.lang.String, js.Any] {
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
  def apply(hostPropertyName: java.lang.String): js.Any = js.native
}

