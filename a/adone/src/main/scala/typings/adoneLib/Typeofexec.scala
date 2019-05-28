package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexec extends js.Object {
  def __promisify__(command: java.lang.String): js.Promise[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_StderrStdoutBuffer] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Promise[nodeLib.Anon_StderrStdout] = js.native
  def __promisify__(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): js.Promise[nodeLib.Anon_Stderr] = js.native
}

