package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRandomAccessFile
  extends org.scalablytyped.runtime.Instantiable1[/* filename */ java.lang.String, adoneLib.adoneNs.fsNs.RandomAccessFile]
     with org.scalablytyped.runtime.Instantiable2[
      /* filename */ java.lang.String, 
      /* options */ adoneLib.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions, 
      adoneLib.adoneNs.fsNs.RandomAccessFile
    ] {
  /**
    * Opens the given file with the given options
    */
  def open(filename: java.lang.String): js.Promise[adoneLib.adoneNs.fsNs.RandomAccessFile] = js.native
  def open(
    filename: java.lang.String,
    options: adoneLib.adoneNs.fsNs.INs.RandomAccessFileNs.ConstructorOptions
  ): js.Promise[adoneLib.adoneNs.fsNs.RandomAccessFile] = js.native
}

