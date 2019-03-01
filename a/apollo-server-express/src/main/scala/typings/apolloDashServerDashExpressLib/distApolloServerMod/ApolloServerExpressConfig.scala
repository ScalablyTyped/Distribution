package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ApolloServerExpressConfig extends js.Object {
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.Any
  ] = js.undefined
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.Any = null
  ): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
}

