package typings
package activexDashScriptingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Scripting.Dictionary")
  var `Scripting.Dictionary_Original`: activexDashScriptingLib.ScriptingNs.Dictionary[_, _] = js.native
  @JSName("Scripting.Encoder")
  var `Scripting.Encoder_Original`: activexDashScriptingLib.ScriptingNs.Encoder = js.native
  var `Scripting.FileSystemObject`: activexDashScriptingLib.ScriptingNs.FileSystemObject = js.native
  /** Set or get the item for a given key */
  def `Scripting.Dictionary`(Key: js.Any): js.Any = js.native
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def `Scripting.Encoder`(
    szExt: java.lang.String,
    bstrStreamIn: java.lang.String,
    cFlags: scala.Double,
    bstrDefaultLang: java.lang.String
  ): java.lang.String = js.native
}

