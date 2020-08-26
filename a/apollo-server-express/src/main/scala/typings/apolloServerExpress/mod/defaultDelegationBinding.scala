package typings.apolloServerExpress.mod

import typings.graphqlToolsDelegate.typesMod.DelegationContext
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "defaultDelegationBinding")
@js.native
object defaultDelegationBinding extends js.Object {
  def apply(delegationContext: DelegationContext): js.Array[Transform[Record[String, _]]] = js.native
}

