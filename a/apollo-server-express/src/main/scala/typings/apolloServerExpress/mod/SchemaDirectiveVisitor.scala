package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.anon.Args
import typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor[TArgs, TContext] protected ()
  extends typings.graphqlTools.mod.SchemaDirectiveVisitor[TArgs, TContext] {
  protected def this(config: Args[TArgs, TContext]) = this()
}

/* static members */
@JSImport("apollo-server-express", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[
    String, 
    js.Array[typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]]
  ] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
    context: Record[String, _]
  ): Record[
    String, 
    js.Array[typings.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]]
  ] = js.native
}

