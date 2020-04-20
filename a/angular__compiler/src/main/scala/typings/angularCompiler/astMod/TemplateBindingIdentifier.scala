package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateBindingIdentifier extends js.Object {
  var source: String
  var span: AbsoluteSourceSpan
}

object TemplateBindingIdentifier {
  @scala.inline
  def apply(source: String, span: AbsoluteSourceSpan): TemplateBindingIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateBindingIdentifier]
  }
}

