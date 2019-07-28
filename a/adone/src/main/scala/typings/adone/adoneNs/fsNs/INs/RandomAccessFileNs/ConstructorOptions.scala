package typings.adone.adoneNs.fsNs.INs.RandomAccessFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  /**
    * Whether the file should be open as appendable
    */
  var appendable: js.UndefOr[Boolean] = js.undefined
  /**
    * Predefined atime
    */
  var atime: js.UndefOr[Double] = js.undefined
  /**
    * Base direcotry for the file
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Predefined mtime
    */
  var mtime: js.UndefOr[Double] = js.undefined
  /**
    * Whether the file should be open as readable
    */
  var readable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the file should be open as writable
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    appendable: js.UndefOr[Boolean] = js.undefined,
    atime: Int | Double = null,
    cwd: String = null,
    mtime: Int | Double = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendable)) __obj.updateDynamic("appendable")(appendable)
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

