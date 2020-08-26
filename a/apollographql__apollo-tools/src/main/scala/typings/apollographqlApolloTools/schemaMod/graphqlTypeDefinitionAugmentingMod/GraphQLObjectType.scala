package typings.apollographqlApolloTools.schemaMod.graphqlTypeDefinitionAugmentingMod

import typings.apollographqlApolloTools.resolveObjectMod.GraphQLObjectResolver
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[_, _]] = js.native
}

object GraphQLObjectType {
  @scala.inline
  def apply(): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLObjectType]
  }
  @scala.inline
  implicit class GraphQLObjectTypeOps[Self <: GraphQLObjectType] (val x: Self) extends AnyVal {
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
    def setResolveObject(
      value: (_, /* fields */ Record[String, js.Array[FieldNode]], _, /* info */ GraphQLResolveInfo) => js.Any
    ): Self = this.set("resolveObject", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveObject: Self = this.set("resolveObject", js.undefined)
  }
  
}

