package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveDecorator
  extends StObject
     with /**
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
    * In order to make a directive available to other components in your application, you should do
    * one of the following:
    *  - either mark the directive as [standalone](guide/standalone-components),
    *  - or declare it in an NgModule by adding it to the `declarations` and `exports` fields.
    *
    * ** Marking a directive as standalone **
    *
    * You can add the `standalone: true` flag to the Directive decorator metadata to declare it as
    * [standalone](guide/standalone-components):
    *
    * ```ts
    * @Directive({
    *   standalone: true,
    *   selector: 'my-directive',
    * })
    * class MyDirective {}
    * ```
    *
    * When marking a directive as standalone, please make sure that the directive is not already
    * declared in an NgModule.
    *
    *
    * ** Declaring a directive in an NgModule **
    *
    * Another approach is to declare a directive in an NgModule:
    *
    * ```ts
    * @Directive({
    *   selector: 'my-directive',
    * })
    * class MyDirective {}
    *
    * @NgModule({
    *   declarations: [MyDirective, SomeComponent],
    *   exports: [MyDirective], // making it available outside of this module
    * })
    * class SomeNgModule {}
    * ```
    *
    * When declaring a directive in an NgModule, please make sure that:
    *  - the directive is declared in exactly one NgModule.
    *  - the directive is not standalone.
    *  - you do not re-declare a directive imported from another module.
    *  - the directive is included into the `exports` field as well if you want this directive to be
    *    accessible for components outside of the NgModule.
    *
    *
    * @Annotation
    */
  def apply(): TypeDecorator = js.native
  def apply(obj: Directive): TypeDecorator = js.native
}
