package typings.apollographqlApolloTools.buildServiceDefinitionMod

import typings.apollographqlApolloTools.resolverMapMod.GraphQLResolverMap
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSchemaModule extends js.Object {
  var resolvers: js.UndefOr[GraphQLResolverMap[_]] = js.native
  var typeDefs: DocumentNode = js.native
}

object GraphQLSchemaModule {
  @scala.inline
  def apply(typeDefs: DocumentNode): GraphQLSchemaModule = {
    val __obj = js.Dynamic.literal(typeDefs = typeDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaModule]
  }
  @scala.inline
  implicit class GraphQLSchemaModuleOps[Self <: GraphQLSchemaModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypeDefs(value: DocumentNode): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvers(value: GraphQLResolverMap[_]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
  }
  
}

