package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a file that is a symbolic link to another file
         */
@JSGlobal("adone.fs.SymbolicLinkFile")
@js.native
class SymbolicLinkFile () extends File {
  /**
               * Returns the path of the file it refers to
               */
  def realpath(): js.Promise[java.lang.String] = js.native
}

