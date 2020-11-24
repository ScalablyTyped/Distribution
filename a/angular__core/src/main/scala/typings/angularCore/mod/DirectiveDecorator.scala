package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveDecorator
  extends /**
  * See the `Directive` decorator.
  */
Instantiable0[Directive]
     with Instantiable1[/* obj */ Directive, Directive] {
  
  /**
    * Decorator that marks a class as an Angular directive.
    * You can define your own directives to attach custom behavior to elements in the DOM.
    *
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
    * ```ts
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
    * ```ts
    * declarations: [
    *  AppComponent,
    *  MyDirective
    * ],
    * ```
    *
    * @Annotation
    */
  def apply(): TypeDecorator = js.native
  def apply(obj: Directive): TypeDecorator = js.native
}
