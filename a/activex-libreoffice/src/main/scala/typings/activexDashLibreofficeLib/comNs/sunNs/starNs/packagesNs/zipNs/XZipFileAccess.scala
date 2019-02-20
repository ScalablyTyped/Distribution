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

