package typings.adone.adoneNs.fsNs.INs.GlobNs

import typings.adone.Anon_PathPatternIndex
import typings.adone.Anon_PatternIndex
import typings.adone.Anon_PatternIndexTrue
import typings.adone.Anon_Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobFunction extends js.Object {
  /**
    * Glob stream class
    */
  var Core: StreamConstructor = js.native
  /**
    * low level glob emitter
    */
  var Glob: EmitterConstructor = js.native
  def apply(patterns: String): Stream[String] = js.native
  def apply(
    patterns: String,
    options: (StreamOptions with (Anon_PatternIndex | Anon_PatternIndexTrue | Anon_Stat)) | StreamOptions
  ): Stream[Anon_PathPatternIndex] = js.native
  def apply(patterns: js.Array[String]): Stream[String] = js.native
  def apply(
    patterns: js.Array[String],
    options: (StreamOptions with (Anon_PatternIndex | Anon_PatternIndexTrue | Anon_Stat)) | StreamOptions
  ): Stream[Anon_PathPatternIndex] = js.native
}

