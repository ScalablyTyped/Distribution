package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFileSpecifier extends js.Object {
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path = js.native
  /**
    * Whether to remove the source file from the parent commit.
    */
  var isMove: js.UndefOr[IsMove] = js.native
}

object SourceFileSpecifier {
  @scala.inline
  def apply(filePath: Path, isMove: js.UndefOr[Boolean] = js.undefined): SourceFileSpecifier = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isMove)) __obj.updateDynamic("isMove")(isMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileSpecifier]
  }
}

