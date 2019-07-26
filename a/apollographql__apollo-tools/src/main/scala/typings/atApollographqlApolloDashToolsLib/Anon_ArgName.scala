package typings
package atApollographqlApolloDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgName[TContext] extends js.Object {
  var requires: js.UndefOr[java.lang.String] = js.native
  @JSName("resolve")
  var resolve_Original: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  var subscribe: js.UndefOr[scala.Nothing] = js.native
  def resolve(
    source: js.Any,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
}

