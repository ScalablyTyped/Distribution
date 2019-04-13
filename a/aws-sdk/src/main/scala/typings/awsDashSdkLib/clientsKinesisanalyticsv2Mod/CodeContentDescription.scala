package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeContentDescription extends js.Object {
  /**
    * The checksum that can be used to validate zip-format code.
    */
  var CodeMD5: js.UndefOr[CodeMD5] = js.undefined
  /**
    * The size in bytes of the application code. Can be used to validate zip-format code.
    */
  var CodeSize: js.UndefOr[CodeSize] = js.undefined
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
    */
  var S3ApplicationCodeLocationDescription: js.UndefOr[S3ApplicationCodeLocationDescription] = js.undefined
  /**
    * The text-format code
    */
  var TextContent: js.UndefOr[TextContent] = js.undefined
}

object CodeContentDescription {
  @scala.inline
  def apply(
    CodeMD5: CodeMD5 = null,
    CodeSize: js.UndefOr[CodeSize] = js.undefined,
    S3ApplicationCodeLocationDescription: S3ApplicationCodeLocationDescription = null,
    TextContent: TextContent = null
  ): CodeContentDescription = {
    val __obj = js.Dynamic.literal()
    if (CodeMD5 != null) __obj.updateDynamic("CodeMD5")(CodeMD5)
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize)
    if (S3ApplicationCodeLocationDescription != null) __obj.updateDynamic("S3ApplicationCodeLocationDescription")(S3ApplicationCodeLocationDescription)
    if (TextContent != null) __obj.updateDynamic("TextContent")(TextContent)
    __obj.asInstanceOf[CodeContentDescription]
  }
}

