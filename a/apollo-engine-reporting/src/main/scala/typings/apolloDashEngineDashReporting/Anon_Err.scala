package typings.apolloDashEngineDashReporting

import typings.graphql.graphqlMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object Anon_Err {
  @scala.inline
  def apply(rewriteError: /* err */ GraphQLError => GraphQLError | Null = null): Anon_Err = {
    val __obj = js.Dynamic.literal()
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1(rewriteError))
    __obj.asInstanceOf[Anon_Err]
  }
}

