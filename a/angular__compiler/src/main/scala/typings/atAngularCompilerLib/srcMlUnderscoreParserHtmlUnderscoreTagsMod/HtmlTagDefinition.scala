package typings
package atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_tags", "HtmlTagDefinition")
@js.native
class HtmlTagDefinition ()
  extends atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagDefinition {
  def this(hasClosedByChildrenRequiredParentsImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLf: atAngularCompilerLib.Anon_IgnoreFirstLf) = this()
  /* CompleteClass */
  override var canSelfClose: scala.Boolean = js.native
  var closedByChildren: js.Any = js.native
  /* CompleteClass */
  override var closedByParent: scala.Boolean = js.native
  /* CompleteClass */
  override var contentType: atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType = js.native
  /* CompleteClass */
  override var ignoreFirstLf: scala.Boolean = js.native
  /* CompleteClass */
  override var implicitNamespacePrefix: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override var isVoid: scala.Boolean = js.native
  /* CompleteClass */
  override var parentToAdd: java.lang.String = js.native
  /* CompleteClass */
  override var requiredParents: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = js.native
  /* CompleteClass */
  override def isClosedByChild(name: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def requireExtraParent(currentParent: java.lang.String): scala.Boolean = js.native
}

