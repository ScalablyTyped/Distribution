package typings
package apolloDashUtilitiesLib.libDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/directives", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDirectiveInfoFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): DirectiveInfo = js.native
  def getDirectiveNames(doc: graphqlLib.languageAstMod.DocumentNode): js.Array[java.lang.String] = js.native
  def getInclusionDirectives(directives: js.Array[graphqlLib.languageAstMod.DirectiveNode]): InclusionDirectives = js.native
  def hasClientExports(document: graphqlLib.languageAstMod.DocumentNode): scala.Boolean = js.native
  def hasDirectives(names: js.Array[java.lang.String], doc: graphqlLib.languageAstMod.DocumentNode): scala.Boolean = js.native
  def shouldInclude(selection: graphqlLib.languageAstMod.SelectionNode): scala.Boolean = js.native
  def shouldInclude(
    selection: graphqlLib.languageAstMod.SelectionNode,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
}

