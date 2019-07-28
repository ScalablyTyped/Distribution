package typings.adone.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStream[T]
  extends Stream[typings.adone.adoneNs.fastNs.INs.File, T] {
  /**
    * Writes all files into the given directory
    *
    * @param directory directory where to write files
    */
  def dest(directory: String): this.type = js.native
  def dest(directory: String, options: LocalStreamDestOptions): this.type = js.native
  /**
    * Writes all files into the given directory using the given callback
    *
    * @param getDirectory callback that returns a directory for each file
    */
  def dest(getDirectory: js.Function1[/* file */ T, String]): this.type = js.native
  def dest(getDirectory: js.Function1[/* file */ T, String], options: LocalStreamDestOptions): this.type = js.native
}

