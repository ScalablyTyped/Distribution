package typings.activexDashLibreoffice.comNs.sunNs.starNs.packagesNs.zipNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to get reading access to non-encrypted entries inside zip file. */
trait XZipFileAccess extends XInterface {
  /**
    * allows to get stream by specifying a pattern.
    *
    * The first stream with a name that fits to the pattern will be returned. The pattern allows to use "*" wildcard symbol. If the name contains "*" or "\"
    * symbols itself they must guarded with backslash "\". The slashes have no special meaning here so they can be replaced by wildcards also.
    */
  def getStreamByPattern(aPattern: String): XInputStream
}

object XZipFileAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getStreamByPattern: String => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XZipFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XZipFileAccess]
  }
}

