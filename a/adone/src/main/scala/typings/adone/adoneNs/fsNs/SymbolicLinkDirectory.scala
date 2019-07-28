package typings.adone.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a directory that is a symbolic link to another directory
  */
@JSGlobal("adone.fs.SymbolicLinkDirectory")
@js.native
class SymbolicLinkDirectory () extends Directory {
  /**
    * Returns the path of the directory it refers to
    */
  def realpath(): js.Promise[String] = js.native
}

