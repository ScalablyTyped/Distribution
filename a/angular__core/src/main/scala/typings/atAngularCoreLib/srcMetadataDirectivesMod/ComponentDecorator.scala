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
org.scalablytyped.runtime.Instantiable1[/* obj */ Component, Component] {
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
    * ### Preserving whitespace
    *
    * Removing whitespace can greatly reduce AOT-generated code size and speed up view creation.
    * As of Angular 6, the default for `preserveWhitespaces` is false (whitespace is removed).
    * To change the default setting for all components in your application, set
    * the `preserveWhitespaces` option of the AOT compiler.
    *
    * By default, the AOT compiler removes whitespace characters as follows:
    * * Trims all whitespaces at the beginning and the end of a template.
    * * Removes whitespace-only text nodes. For example,
    *
    * ```
    * <button>Action 1</button>  <button>Action 2</button>
    * ```
    *
    * becomes:
    *
    * ```
    * <button>Action 1</button><button>Action 2</button>
    * ```
    *
    * * Replaces a series of whitespace characters in text nodes with a single space.
    * For example, `<span>\n some text\n</span>` becomes `<span> some text </span>`.
    * * Does NOT alter text nodes inside HTML tags such as `<pre>` or `<textarea>`,
    * where whitespace characters are significant.
    *
    * Note that these transformations can influence DOM nodes layout, although impact
    * should be minimal.
    *
    * You can override the default behavior to preserve whitespace characters
    * in certain fragments of a template. For example, you can exclude an entire
    * DOM sub-tree by using the `ngPreserveWhitespaces` attribute:
    *
    * ```html
    * <div ngPreserveWhitespaces>
    *     whitespaces are preserved here
    *     <span>    and here </span>
    * </div>
    * ```
    *
    * You can force a single space to be preserved in a text node by using `&ngsp;`,
    * which is replaced with a space character by Angular's template
    * compiler:
    *
    * ```html
    * <a>Spaces</a>&ngsp;<a>between</a>&ngsp;<a>links.</a>
    * <!-->compiled to be equivalent to:</>
    *  <a>Spaces</a> <a>between</a> <a>links.</a>
    * ```
    *
    * Note that sequences of `&ngsp;` are still collapsed to just one space character when
    * the `preserveWhitespaces` option is set to `false`.
    *
    * ```html
    * <a>before</a>&ngsp;&ngsp;&ngsp;<a>after</a>
    * <!-->compiled to be equivalent to:</>
    *  <a>Spaces</a> <a>between</a> <a>links.</a>
    * ```
    *
    * To preserve sequences of whitespace characters, use the
    * `ngPreserveWhitespaces` attribute.
    *
    * @Annotation
    */
  def apply(obj: Component): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
}

