package typings
package atAngularCoreLib.srcMetadataDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDecorator
  extends org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, Attribute] {
  /**
    * Specifies that a constant attribute value should be injected.
    *
    * The directive can inject constant string literals of host element attributes.
    *
    * @usageNotes
    * ### Example
    *
    * Suppose we have an `<input>` element and want to know its `type`.
    *
    * ```html
    * <input type="text">
    * ```
    *
    * A decorator can inject string literal `text` as in the following example.
    *
    * {@example core/ts/metadata/metadata.ts region='attributeMetadata'}
    *
    * @publicApi
    */
  def apply(name: java.lang.String): js.Any = js.native
}

