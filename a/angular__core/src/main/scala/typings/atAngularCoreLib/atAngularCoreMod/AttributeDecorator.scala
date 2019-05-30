package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDecorator
  extends org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, Attribute] {
  /**
    * A parameter decorator for a directive constructor that designates
    * a host-element attribute whose value is injected as a constant string literal.
    *
    * @usageNotes
    *
    * Suppose we have an `<input>` element and want to know its `type`.
    *
    * ```html
    * <input type="text">
    * ```
    *
    * The following example uses the decorator to inject the string literal `text`.
    *
    * {@example core/ts/metadata/metadata.ts region='attributeMetadata'}
    *
    * ### Example as TypeScript Decorator
    *
    * {@example core/ts/metadata/metadata.ts region='attributeFactory'}
    *
    */
  def apply(name: java.lang.String): js.Any = js.native
}

