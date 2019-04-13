package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Target extends js.Object {
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.undefined
  /**
    * The path to the Amazon S3 target.
    */
  var Path: js.UndefOr[Path] = js.undefined
}

object S3Target {
  @scala.inline
  def apply(Exclusions: PathList = null, Path: Path = null): S3Target = {
    val __obj = js.Dynamic.literal()
    if (Exclusions != null) __obj.updateDynamic("Exclusions")(Exclusions)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[S3Target]
  }
}

