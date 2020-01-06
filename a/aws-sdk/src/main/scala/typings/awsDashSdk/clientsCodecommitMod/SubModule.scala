package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubModule extends js.Object {
  /**
    * The fully qualified path to the folder that contains the reference to the submodule.
    */
  var absolutePath: js.UndefOr[Path] = js.native
  /**
    * The commit ID that contains the reference to the submodule.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The relative path of the submodule from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.native
}

object SubModule {
  @scala.inline
  def apply(absolutePath: Path = null, commitId: ObjectId = null, relativePath: Path = null): SubModule = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubModule]
  }
}

