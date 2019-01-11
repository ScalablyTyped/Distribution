package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("archiver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(format: archiverLib.archiverMod.archiverNs.Format): archiverLib.archiverMod.archiverNs.Archiver = js.native
  def apply(
    format: archiverLib.archiverMod.archiverNs.Format,
    options: archiverLib.archiverMod.archiverNs.ArchiverOptions
  ): archiverLib.archiverMod.archiverNs.Archiver = js.native
  def create(format: java.lang.String): archiverLib.archiverMod.archiverNs.Archiver = js.native
  def create(format: java.lang.String, options: archiverLib.archiverMod.archiverNs.ArchiverOptions): archiverLib.archiverMod.archiverNs.Archiver = js.native
  def registerFormat(format: java.lang.String, module: js.Function): scala.Unit = js.native
}

