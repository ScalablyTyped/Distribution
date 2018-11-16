package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDecorator
  extends /**
     * See the `@Component` decorator.
     */
ScalablyTyped.runtime.Instantiable1[/* obj */ Component, Component] {
  /**
       * Decorator that marks a class as an Angular component and provides configuration
       * metadata that determines how the component should be processed,
       * instantiated, and used at runtime.
       *
       * Components are the most basic UI building block of an Angular app.
       * An Angular app contains a tree of Angular components.
       *
       * Angular components are a subset of directives, always associated with a template.
       * Unlike other directives, only one component can be instantiated per an element in a template.
       *
       * A component must belong to an NgModule in order for it to be available
       * to another component or application. To make it a member of an NgModule,
       * list it in the `declarations` field of the `@NgModule` metadata.
       *
       * Note that, in addition to these options for configuring a directive,
       * you can control a component's runtime behavior by implementing
       * life-cycle hooks. For more information, see the
       * [Lifecycle Hooks](guide/lifecycle-hooks) guide.
       *
       * @usageNotes
       *
       * ### Setting component inputs
       *
       * The following example creates a component with two data-bound properties,
       * specified by the `inputs` value.
       *
       * <code-example path="core/ts/metadata/directives.ts" region="component-input">
       * </code-example>
       *
       *
       * ### Setting component outputs
       *
       * The following example shows two event emitters that emit on an interval. One
       * emits an output every second, while the other emits every five seconds.
       *
       * {@example core/ts/metadata/directives.ts region='component-output-interval'}
       *
       * ### Injecting a class with a view provider
       *
       * The following simple example injects a class into a component
       * using the view provider specified in component metadata:
       *
       * ```
       * class Greeter {
       *    greet(name:string) {
       *      return 'Hello ' + name + '!';
       *    }
       * }
       *
       * @Directive({
       *   selector: 'needs-greeter'
       * })
       * class NeedsGreeter {
       *   greeter:Greeter;
       *
       *   constructor(greeter:Greeter) {
       *     this.greeter = greeter;
       *   }
       * }
       *
       * @Component({
       *   selector: 'greet',
       *   viewProviders: [
       *     Greeter
       *   ],
       *   template: `<needs-greeter></needs-greeter>`
       * })
       * class HelloWorld {
       * }
       *
       * ```
       *
       *
       * @Annotation
       */
  def apply(obj: Component): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
}

