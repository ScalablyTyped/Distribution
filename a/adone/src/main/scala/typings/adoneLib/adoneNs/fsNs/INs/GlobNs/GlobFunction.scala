package typings
package adoneLib.adoneNs.fsNs.INs.GlobNs

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
  def apply(patterns: java.lang.String): Stream[java.lang.String] = js.native
  def apply(
    patterns: java.lang.String,
    options: (StreamOptions with (adoneLib.Anon_PatternIndex | adoneLib.Anon_PatternIndexTrue | adoneLib.Anon_Stat)) | StreamOptions
  ): Stream[adoneLib.Anon_PathPatternIndex] = js.native
  def apply(patterns: js.Array[java.lang.String]): Stream[java.lang.String] = js.native
  def apply(
    patterns: js.Array[java.lang.String],
    options: (StreamOptions with (adoneLib.Anon_PatternIndex | adoneLib.Anon_PatternIndexTrue | adoneLib.Anon_Stat)) | StreamOptions
  ): Stream[adoneLib.Anon_PathPatternIndex] = js.native
}

