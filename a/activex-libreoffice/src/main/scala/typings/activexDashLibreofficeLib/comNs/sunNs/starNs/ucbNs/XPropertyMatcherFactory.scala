package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an {@link XPropertyMatcher} , given a set of search criteria. */
trait XPropertyMatcherFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an {@link XPropertyMatcher} .
    * @param Criteria The set of search criteria the returned {@link XPropertyMatcher} will use.
    * @returns An {@link XPropertyMatcher} with the given search criteria.
    */
  def createPropertyMatcher(Criteria: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SearchCriterium]): XPropertyMatcher
}

object XPropertyMatcherFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createPropertyMatcher: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SearchCriterium], 
      XPropertyMatcher
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPropertyMatcherFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createPropertyMatcher")(createPropertyMatcher)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPropertyMatcherFactory]
  }
}

