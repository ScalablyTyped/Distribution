package typings
package apolloDashUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransformMod {
  type GetDirectiveConfig = GetNodeConfig[graphqlLib.languageAstMod.DirectiveNode]
  type GetFragmentSpreadConfig = GetNodeConfig[graphqlLib.languageAstMod.FragmentSpreadNode]
  type RemoveArgumentsConfig = RemoveNodeConfig[graphqlLib.languageAstMod.ArgumentNode]
  type RemoveDirectiveConfig = RemoveNodeConfig[graphqlLib.languageAstMod.DirectiveNode]
  type RemoveFragmentDefinitionConfig = RemoveNodeConfig[graphqlLib.languageAstMod.FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = RemoveNodeConfig[graphqlLib.languageAstMod.FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = RemoveNodeConfig[graphqlLib.languageAstMod.VariableDefinitionNode]
}
