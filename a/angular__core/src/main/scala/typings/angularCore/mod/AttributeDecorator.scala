package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeDecorator
  extends StObject
     with Instantiable1[/* name */ String, Attribute] {
  
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
    * The following example uses the decorator to inject the string literal `text` in a directive.
    *
    * {@example core/ts/metadata/metadata.ts region='attributeMetadata'}
    *
    * The following example uses the decorator in a component constructor.
    *
    * {@example core/ts/metadata/metadata.ts region='attributeFactory'}
    *
    */
  def apply(name: String): js.Any = js.native
}
