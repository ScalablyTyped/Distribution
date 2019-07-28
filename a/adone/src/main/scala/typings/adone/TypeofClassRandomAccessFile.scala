package typings.adone

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.adone.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions
import typings.adone.adoneNs.fsNs.RandomAccessFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRandomAccessFile
  extends Instantiable1[/* filename */ String, RandomAccessFile]
     with Instantiable2[/* filename */ String, /* options */ ConstructorOptions, RandomAccessFile] {
  /**
    * Opens the given file with the given options
    */
  def open(filename: String): js.Promise[RandomAccessFile] = js.native
  def open(filename: String, options: ConstructorOptions): js.Promise[RandomAccessFile] = js.native
}

