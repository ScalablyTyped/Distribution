package typings.apolloServer.exportsMod

import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "mergeInterface")
@js.native
object mergeInterface extends js.Object {
  def apply(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def apply(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def apply(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def apply(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
}

