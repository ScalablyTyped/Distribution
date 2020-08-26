package typings.angularCompiler

import typings.angularCompiler.anon.ClosedByChildren
import typings.angularCompiler.tagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_tags", JSImport.Namespace)
@js.native
object htmlTagsMod extends js.Object {
  @js.native
  class HtmlTagDefinition () extends TagDefinition {
    def this(hasClosedByChildrenImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLf: ClosedByChildren) = this()
    var closedByChildren: js.Any = js.native
  }
  
  def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = js.native
}

