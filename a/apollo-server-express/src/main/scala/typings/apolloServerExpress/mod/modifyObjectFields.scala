package typings.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "modifyObjectFields")
@js.native
object modifyObjectFields extends js.Object {
  def apply(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ],
    newFields: GraphQLFieldConfigMap[_, _]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
}

