package typings.apolloServerExpress.apolloServerMod

import typings.apolloServerCore.typesMod.Config
import typings.apolloServerCore.typesMod.Context
import typings.apolloServerCore.typesMod.ContextFunction
import typings.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerExpressConfig extends Config {
  @JSName("context")
  var context_ApolloServerExpressConfig: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.native
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
  @scala.inline
  implicit class ApolloServerExpressConfigOps[Self <: ApolloServerExpressConfig] (val x: Self) extends AnyVal {
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
    def setContextFunction1(value: ExpressContext => ValueOrPromise[Context[Context[js.Object]]]): Self = this.set("context", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

