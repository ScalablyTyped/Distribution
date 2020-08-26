package typings.apollographqlApolloTools.buildServiceDefinitionMod

import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceDefinition extends js.Object {
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
}

object GraphQLServiceDefinition {
  @scala.inline
  def apply(): GraphQLServiceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLServiceDefinition]
  }
  @scala.inline
  implicit class GraphQLServiceDefinitionOps[Self <: GraphQLServiceDefinition] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

