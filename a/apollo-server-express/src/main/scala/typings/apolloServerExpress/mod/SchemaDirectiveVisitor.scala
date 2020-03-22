package typings.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.AnonArgs
import typings.graphqlTools.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends typings.graphqlTools.mod.SchemaDirectiveVisitor {
  protected def this(config: AnonArgs) = this()
}

/* static members */
@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typings.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

