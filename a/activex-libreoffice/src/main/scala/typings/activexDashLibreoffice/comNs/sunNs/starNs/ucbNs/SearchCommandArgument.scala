package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "search".
  * @see XCommandProcessor
  */
trait SearchCommandArgument extends js.Object {
  /** the search criteria. */
  var Info: SearchInfo
  /** the properties for which values shall be provided through the {@link ContentResultSet} returned by the search command. */
  var Properties: SafeArray[Property]
}

object SearchCommandArgument {
  @scala.inline
  def apply(Info: SearchInfo, Properties: SafeArray[Property]): SearchCommandArgument = {
    val __obj = js.Dynamic.literal(Info = Info, Properties = Properties)
  
    __obj.asInstanceOf[SearchCommandArgument]
  }
}

