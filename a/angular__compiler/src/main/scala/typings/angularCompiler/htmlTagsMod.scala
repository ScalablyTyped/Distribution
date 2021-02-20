package typings.angularCompiler

import typings.angularCompiler.anon.ClosedByChildren
import typings.angularCompiler.tagsMod.TagDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlTagsMod {
  
  @JSImport("@angular/compiler/src/ml_parser/html_tags", "HtmlTagDefinition")
  @js.native
  class HtmlTagDefinition () extends TagDefinition {
    def this(hasClosedByChildrenImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLfPreventNamespaceInheritance: ClosedByChildren) = this()
    
    var closedByChildren: js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/ml_parser/html_tags", "getHtmlTagDefinition")
  @js.native
  def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = js.native
}
