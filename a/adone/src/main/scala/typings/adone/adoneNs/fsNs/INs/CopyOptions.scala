package typings.adone.adoneNs.fsNs.INs

import typings.adone.Anon_Atime
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  /**
    * Whether to overwrite destination files if they exist.
    *
    * true by default
    */
  var clobber: js.UndefOr[Boolean] = js.undefined
  /**
    * regexp or function against which each filename is tested whether to copy it or not
    */
  var filter: js.UndefOr[RegExp | (js.Function2[/* src */ String, /* dst */ String, Boolean])] = js.undefined
   // ???
  /**
    * Whether to overwrite destination files if they exist.
    *
    * true by default
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * transform function which applies when files are streamed
    */
  var transform: js.UndefOr[
    js.Function3[
      /* readStream */ ReadableStream, 
      /* writeStream */ WritableStream, 
      /* file */ Anon_Atime, 
      Unit
    ]
  ] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    clobber: js.UndefOr[Boolean] = js.undefined,
    filter: RegExp | (js.Function2[/* src */ String, /* dst */ String, Boolean]) = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    transform: (/* readStream */ ReadableStream, /* writeStream */ WritableStream, /* file */ Anon_Atime) => Unit = null
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[CopyOptions]
  }
}

