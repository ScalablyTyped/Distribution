package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDirectory
  extends org.scalablytyped.runtime.Instantiable1[/* path (repeated) */ java.lang.String, adoneLib.adoneNs.fsNs.Directory] {
  /**
    * Creates a new directory with the given path
    */
  def create(path: java.lang.String*): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
  /**
    * Creates a new temporary directory
    */
  def createTmp(): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
  def createTmp(options: adoneLib.adoneNs.fsNs.INs.TmpNameOptions): js.Promise[adoneLib.adoneNs.fsNs.Directory] = js.native
}

