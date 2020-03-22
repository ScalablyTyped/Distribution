package typings.algoliaTransporter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/transporter", "serializeUrl")
@js.native
object serializeUrl extends js.Object {
  def apply(host: StatelessHost, path: String, queryParameters: Record[String, String]): String = js.native
}

