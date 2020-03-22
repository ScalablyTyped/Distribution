package typings.algoliaClientSearch.mod

import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIndex extends js.Object {
  /**
    * The application id.
    */
  val appId: String
  /**
    * The index name.
    */
  val indexName: String
  /**
    * The underlying transporter.
    */
  val transporter: Transporter
}

object SearchIndex {
  @scala.inline
  def apply(appId: String, indexName: String, transporter: Transporter): SearchIndex = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIndex]
  }
}

