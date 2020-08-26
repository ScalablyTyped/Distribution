package typings.apolloReactCommon.apolloConsumerMod

import typings.apolloClient.mod.default
import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloConsumerProps extends js.Object {
  def children(client: default[js.Object]): ReactChild | Null = js.native
}

object ApolloConsumerProps {
  @scala.inline
  def apply(children: default[js.Object] => ReactChild | Null): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ApolloConsumerProps]
  }
  @scala.inline
  implicit class ApolloConsumerPropsOps[Self <: ApolloConsumerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: default[js.Object] => ReactChild | Null): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

