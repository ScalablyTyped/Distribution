package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JdbcTarget extends js.Object {
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var ConnectionName: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ConnectionName] = js.native
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  /**
    * The path of the JDBC target.
    */
  var Path: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Path] = js.native
}

object JdbcTarget {
  @scala.inline
  def apply(ConnectionName: ConnectionName = null, Exclusions: PathList = null, Path: Path = null): JdbcTarget = {
    val __obj = js.Dynamic.literal()
    if (ConnectionName != null) __obj.updateDynamic("ConnectionName")(ConnectionName.asInstanceOf[js.Any])
    if (Exclusions != null) __obj.updateDynamic("Exclusions")(Exclusions.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JdbcTarget]
  }
}

