package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFileSpecifier extends js.Object {
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path
  /**
    * Whether to remove the source file from the parent commit.
    */
  var isMove: js.UndefOr[IsMove] = js.undefined
}

object SourceFileSpecifier {
  @scala.inline
  def apply(filePath: Path, isMove: js.UndefOr[IsMove] = js.undefined): SourceFileSpecifier = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (!js.isUndefined(isMove)) __obj.updateDynamic("isMove")(isMove)
    __obj.asInstanceOf[SourceFileSpecifier]
  }
}

