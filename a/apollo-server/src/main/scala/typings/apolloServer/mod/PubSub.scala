package typings.apolloServer.mod

import typings.graphqlSubscriptions.pubsubMod.PubSubOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "PubSub")
@js.native
class PubSub ()
  extends typings.apolloServer.exportsMod.PubSub {
  def this(options: PubSubOptions) = this()
}

