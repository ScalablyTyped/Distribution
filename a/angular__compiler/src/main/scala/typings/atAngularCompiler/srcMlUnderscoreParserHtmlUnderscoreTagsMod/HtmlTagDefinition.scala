package typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreTagsMod

import typings.atAngularCompiler.Anon_ClosedByChildren
import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType
import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_tags", "HtmlTagDefinition")
@js.native
class HtmlTagDefinition () extends TagDefinition {
  def this(hasClosedByChildrenImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLf: Anon_ClosedByChildren) = this()
  /* CompleteClass */
  override var canSelfClose: Boolean = js.native
  var closedByChildren: js.Any = js.native
  /* CompleteClass */
  override var closedByParent: Boolean = js.native
  /* CompleteClass */
  override var contentType: TagContentType = js.native
  /* CompleteClass */
  override var ignoreFirstLf: Boolean = js.native
  /* CompleteClass */
  override var implicitNamespacePrefix: String | Null = js.native
  /* CompleteClass */
  override var isVoid: Boolean = js.native
  /* CompleteClass */
  override def isClosedByChild(name: String): Boolean = js.native
}

