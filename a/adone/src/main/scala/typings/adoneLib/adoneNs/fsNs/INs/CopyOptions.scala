package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  /**
    * Whether to overwrite destination files if they exist.
    *
    * true by default
    */
  var clobber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * regexp or function against which each filename is tested whether to copy it or not
    */
  var filter: js.UndefOr[
    stdLib.RegExp | (js.Function2[/* src */ java.lang.String, /* dst */ java.lang.String, scala.Boolean])
  ] = js.undefined
   // ???
  /**
    * Whether to overwrite destination files if they exist.
    *
    * true by default
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * transform function which applies when files are streamed
    */
  var transform: js.UndefOr[
    js.Function3[
      /* readStream */ nodeLib.NodeJSNs.ReadableStream, 
      /* writeStream */ nodeLib.NodeJSNs.WritableStream, 
      /* file */ adoneLib.Anon_AtimeMode, 
      scala.Unit
    ]
  ] = js.undefined
}

