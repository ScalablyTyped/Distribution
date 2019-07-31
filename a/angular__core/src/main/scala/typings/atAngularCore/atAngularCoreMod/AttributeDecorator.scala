package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDecorator extends Instantiable1[/* name */ String, Attribute] {
  /**
    * Parameter decorator for a directive constructor that designates
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
  def apply(name: String): js.Any = js.native
}

