package typings.activexDashScripting.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Script Encoder Object */
@js.native
trait Encoder extends js.Object {
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def apply(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def EncodeScriptFile(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
}

