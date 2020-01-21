package typings.apolloServer.exportsMod

import typings.graphqlSubscriptions.pubsubMod.PubSubOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "PubSub")
@js.native
class PubSub ()
  extends typings.graphqlSubscriptions.mod.PubSub {
  def this(options: PubSubOptions) = this()
}

