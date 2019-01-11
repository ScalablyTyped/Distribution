package typings
package apolloDashUtilitiesLib.libDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/directives", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flattenSelections(selection: graphqlLib.languageAstMod.SelectionNode): js.Array[graphqlLib.languageAstMod.SelectionNode] = js.native
  def getDirectiveInfoFromField(field: graphqlLib.languageAstMod.FieldNode, variables: js.Object): apolloDashUtilitiesLib.libDirectivesMod.DirectiveInfo = js.native
  def getDirectiveNames(doc: graphqlLib.languageAstMod.DocumentNode): js.Array[java.lang.String] = js.native
  def hasDirectives(names: js.Array[java.lang.String], doc: graphqlLib.languageAstMod.DocumentNode): scala.Boolean = js.native
  def shouldInclude(selection: graphqlLib.languageAstMod.SelectionNode): scala.Boolean = js.native
  def shouldInclude(
    selection: graphqlLib.languageAstMod.SelectionNode,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
}

