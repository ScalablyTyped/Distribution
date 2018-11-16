package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveDecorator
  extends /**
     * See the `Directive` decorator.
     */
ScalablyTyped.runtime.Instantiable1[/* obj */ Directive, Directive] {
  /**
       * Marks a class as an Angular directive. You can define your own
       * directives to attach custom behavior to elements in the DOM.
       * The options provide configuration metadata that determines
       * how the directive should be processed, instantiated and used at
       * runtime.
       *
       * Directive classes, like component classes, can implement
       * [life-cycle hooks](guide/lifecycle-hooks) to influence their configuration and behavior.
       *
       *
       * @usageNotes
       * To define a directive, mark the class with the decorator and provide metadata.
       *
       * ```
       * import {Directive} from '@angular/core';
       *
       * @Directive({
       *   selector: 'my-directive',
       * })
       * export class MyDirective {
       * ...
       * }
       * ```
       *
       * ### Declaring directives
       *
       * Directives are [declarables](guide/glossary#declarable).
       * They must be declared by an NgModule
       * in order to be usable in an app.
       *
       * A directive must belong to exactly one NgModule. Do not re-declare
       * a directive imported from another module.
       * List the directive class in the `declarations` field of an NgModule.
       *
       * ```
       * declarations: [
       *  AppComponent,
       *  MyDirective
       * ],
       * ```
       *
       * @Annotation
       */
  def apply(obj: Directive): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
}

