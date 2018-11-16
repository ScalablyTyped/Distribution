package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Script Encoder Object */
@js.native
trait Encoder extends js.Object {
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def apply(
    szExt: java.lang.String,
    bstrStreamIn: java.lang.String,
    cFlags: scala.Double,
    bstrDefaultLang: java.lang.String
  ): java.lang.String = js.native
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def EncodeScriptFile(
    szExt: java.lang.String,
    bstrStreamIn: java.lang.String,
    cFlags: scala.Double,
    bstrDefaultLang: java.lang.String
  ): java.lang.String = js.native
}

