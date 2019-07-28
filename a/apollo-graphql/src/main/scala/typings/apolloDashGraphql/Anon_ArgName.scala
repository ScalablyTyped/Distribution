package typings.apolloDashGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgName[TContext] extends js.Object {
  var requires: js.UndefOr[String] = js.native
  @JSName("resolve")
  var resolve_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
  def resolve(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
}

