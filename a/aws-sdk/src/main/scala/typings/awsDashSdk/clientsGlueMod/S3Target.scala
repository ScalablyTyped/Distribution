package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.native
  /**
    * The path to the Amazon S3 target.
    */
  var Path: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Path] = js.native
}

object S3Target {
  @scala.inline
  def apply(Exclusions: PathList = null, Path: Path = null): S3Target = {
    val __obj = js.Dynamic.literal()
    if (Exclusions != null) __obj.updateDynamic("Exclusions")(Exclusions.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Target]
  }
}

