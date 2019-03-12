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
    acquire: () => scala.Unit,
    createPropertyMatcher: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SearchCriterium] => XPropertyMatcher,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XPropertyMatcherFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createPropertyMatcher = js.Any.fromFunction1(createPropertyMatcher), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPropertyMatcherFactory]
  }
}

