package typings
package asciifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asciify", JSImport.Namespace)
@js.native
object asciifyMod extends js.Object {
  def apply(text: java.lang.String, callback: asciifyLib.AsciifyCallback): scala.Unit = js.native
  def apply(text: java.lang.String, options: asciifyLib.AsciifyOptions, callback: asciifyLib.AsciifyCallback): scala.Unit = js.native
  def apply(text: java.lang.String, options: java.lang.String, callback: asciifyLib.AsciifyCallback): scala.Unit = js.native
  def getFonts(
    callback: js.Function2[/* err */ nodeLib.Error, /* fonts */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

