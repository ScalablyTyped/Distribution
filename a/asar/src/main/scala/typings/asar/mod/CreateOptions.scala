package typings.asar.mod

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var dot: js.UndefOr[Boolean] = js.undefined
  var globOptions: js.UndefOr[IOptions] = js.undefined
  var ordering: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* filePath */ String, String]] = js.undefined
  var unpack: js.UndefOr[String] = js.undefined
  var unpackDir: js.UndefOr[String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    dot: js.UndefOr[Boolean] = js.undefined,
    globOptions: IOptions = null,
    ordering: String = null,
    pattern: String = null,
    transform: /* filePath */ String => String = null,
    unpack: String = null,
    unpackDir: String = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    if (ordering != null) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (unpack != null) __obj.updateDynamic("unpack")(unpack.asInstanceOf[js.Any])
    if (unpackDir != null) __obj.updateDynamic("unpackDir")(unpackDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

