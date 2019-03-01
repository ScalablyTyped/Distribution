package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Checks whether a set of properties matches a set of search criteria.
  * @see XPropertyMatcherFactory.
  */
trait XPropertyMatcher
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Checks whether a set of properties matches the given search criteria.
    * @param Properties A {@link Command} Processor through which the set of properties is accessible.
    * @param Environment The environment to use when accessing the property set via the given {@link Command} Processor. It may be null.
    * @returns `TRUE` if the properties match, `FALSE` otherwise.
    */
  def matches(Properties: XCommandProcessor, Environment: XCommandEnvironment): scala.Boolean
}

object XPropertyMatcher {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    matches: js.Function2[XCommandProcessor, XCommandEnvironment, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertyMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("matches")(matches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPropertyMatcher]
  }
}

