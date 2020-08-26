package typings.apolloTracing.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolvers extends js.Object {
  var resolvers: js.Array[Duration] = js.native
}

object Resolvers {
  @scala.inline
  def apply(resolvers: js.Array[Duration]): Resolvers = {
    val __obj = js.Dynamic.literal(resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolvers]
  }
  @scala.inline
  implicit class ResolversOps[Self <: Resolvers] (val x: Self) extends AnyVal {
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
    def setResolversVarargs(value: Duration*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: js.Array[Duration]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
  }
  
}

