package typings.apolloServerTypes.mod

import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldResolverParams[TSource, TContext, TArgs] extends js.Object {
  var args: TArgs
  var context: TContext
  var info: GraphQLResolveInfo
  var source: TSource
}

object GraphQLFieldResolverParams {
  @scala.inline
  def apply[TSource, TContext, TArgs](args: TArgs, context: TContext, info: GraphQLResolveInfo, source: TSource): GraphQLFieldResolverParams[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldResolverParams[TSource, TContext, TArgs]]
  }
}

