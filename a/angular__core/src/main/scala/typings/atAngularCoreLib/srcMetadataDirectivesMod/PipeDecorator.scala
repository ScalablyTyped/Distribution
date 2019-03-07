package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeDecorator
  extends /**
  * See the `Pipe` decorator.
  */
org.scalablytyped.runtime.Instantiable1[/* obj */ Pipe, Pipe] {
  /**
    *
    * Decorator that marks a class as pipe and supplies configuration metadata.
    *
    * A pipe class must implement the `PipeTransform` interface.
    * For example, if the name is "myPipe", use a template binding expression
    * such as the following:
    *
    * ```
    * {{ exp | myPipe }}
    * ```
    *
    * The result of the expression is passed to the pipe's `transform()` method.
    *
    * A pipe must belong to an NgModule in order for it to be available
    * to a template. To make it a member of an NgModule,
    * list it in the `declarations` field of the `NgModule` metadata.
    *
    */
  def apply(obj: Pipe): atAngularCoreLib.srcUtilDecoratorsMod.TypeDecorator = js.native
}

