package typings.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformMod {
  type GetDirectiveConfig = typings.apolloUtilities.transformMod.GetNodeConfig[typings.graphql.astMod.DirectiveNode]
  type GetFragmentSpreadConfig = typings.apolloUtilities.transformMod.GetNodeConfig[typings.graphql.astMod.FragmentSpreadNode]
  type RemoveArgumentsConfig = typings.apolloUtilities.transformMod.RemoveNodeConfig[typings.graphql.astMod.ArgumentNode]
  type RemoveDirectiveConfig = typings.apolloUtilities.transformMod.RemoveNodeConfig[typings.graphql.astMod.DirectiveNode]
  type RemoveFragmentDefinitionConfig = typings.apolloUtilities.transformMod.RemoveNodeConfig[typings.graphql.astMod.FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = typings.apolloUtilities.transformMod.RemoveNodeConfig[typings.graphql.astMod.FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = typings.apolloUtilities.transformMod.RemoveNodeConfig[typings.graphql.astMod.VariableDefinitionNode]
}
