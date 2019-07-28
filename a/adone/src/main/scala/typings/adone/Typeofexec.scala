package typings.adone

import typings.node.Anon_EncodingNull
import typings.node.Anon_Stderr
import typings.node.Anon_StderrStdout
import typings.node.Anon_StderrStdoutBuffer
import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.node.childUnderscoreProcessMod.PromiseWithChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofexec extends js.Object {
  def __promisify__(command: String): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: String, options: typings.node.Anon_Buffer with ExecOptions): PromiseWithChild[Anon_StderrStdout] = js.native
  def __promisify__(command: String, options: typings.node.Anon_Encoding with ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
  def __promisify__(command: String, options: Anon_EncodingNull with ExecOptions): PromiseWithChild[Anon_StderrStdoutBuffer] = js.native
  def __promisify__(command: String, options: ExecOptions): PromiseWithChild[Anon_Stderr] = js.native
}

