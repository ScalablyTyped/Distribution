package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchClient extends js.Object {
  /**
    * The application id.
    */
  val appId: String = js.native
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
  /**
    * Mutates the transporter, adding the given user agent.
    */
  def addAlgoliaAgent(segment: String): Unit = js.native
  def addAlgoliaAgent(segment: String, version: String): Unit = js.native
  /**
    * Clears both requests and responses caches.
    */
  def clearCache(): ReadonlyPromisevoid = js.native
}

