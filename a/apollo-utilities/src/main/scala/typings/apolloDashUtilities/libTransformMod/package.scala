package typings.apolloDashUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransformMod {
  import typings.graphql.languageAstMod.ArgumentNode
  import typings.graphql.languageAstMod.DirectiveNode
  import typings.graphql.languageAstMod.FragmentDefinitionNode
  import typings.graphql.languageAstMod.FragmentSpreadNode
  import typings.graphql.languageAstMod.VariableDefinitionNode

  type GetDirectiveConfig = GetNodeConfig[DirectiveNode]
  type GetFragmentSpreadConfig = GetNodeConfig[FragmentSpreadNode]
  type RemoveArgumentsConfig = RemoveNodeConfig[ArgumentNode]
  type RemoveDirectiveConfig = RemoveNodeConfig[DirectiveNode]
  type RemoveFragmentDefinitionConfig = RemoveNodeConfig[FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = RemoveNodeConfig[FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = RemoveNodeConfig[VariableDefinitionNode]
}
