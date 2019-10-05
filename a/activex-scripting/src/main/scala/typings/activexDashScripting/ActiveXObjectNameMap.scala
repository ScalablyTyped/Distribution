package typings.activexDashScripting

import typings.activexDashScripting.Scripting.Dictionary
import typings.activexDashScripting.Scripting.Encoder
import typings.activexDashScripting.Scripting.FileSystemObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Scripting.Dictionary")
  var `Scripting.Dictionary_Original`: Dictionary[_, _] = js.native
  @JSName("Scripting.Encoder")
  var `Scripting.Encoder_Original`: Encoder = js.native
  var `Scripting.FileSystemObject`: FileSystemObject = js.native
  /** Set or get the item for a given key */
  def `Scripting.Dictionary`(Key: js.Any): js.Any = js.native
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  def `Scripting.Encoder`(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
}

