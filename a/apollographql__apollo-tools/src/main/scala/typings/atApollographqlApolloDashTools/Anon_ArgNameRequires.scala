package typings.atApollographqlApolloDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgNameRequires[TContext] extends js.Object {
  var requires: js.UndefOr[String] = js.native
  var resolve: js.UndefOr[scala.Nothing] = js.native
  @JSName("subscribe")
  var subscribe_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
  def subscribe(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
}

