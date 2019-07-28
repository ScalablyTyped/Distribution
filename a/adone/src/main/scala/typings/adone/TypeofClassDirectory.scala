package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.fsNs.Directory
import typings.adone.adoneNs.fsNs.INs.TmpNameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassDirectory extends Instantiable1[/* path (repeated) */ String, Directory] {
  /**
    * Creates a new directory with the given path
    */
  def create(path: String*): js.Promise[Directory] = js.native
  /**
    * Creates a new temporary directory
    */
  def createTmp(): js.Promise[Directory] = js.native
  def createTmp(options: TmpNameOptions): js.Promise[Directory] = js.native
}

