package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.zipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to get reading access to non-encrypted entries inside zip file. */
trait XZipFileAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get stream by specifying a pattern.
    *
    * The first stream with a name that fits to the pattern will be returned. The pattern allows to use "*" wildcard symbol. If the name contains "*" or "\"
    * symbols itself they must guarded with backslash "\". The slashes have no special meaning here so they can be replaced by wildcards also.
    */
  def getStreamByPattern(aPattern: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
}

object XZipFileAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getStreamByPattern: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XZipFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XZipFileAccess]
  }
}

