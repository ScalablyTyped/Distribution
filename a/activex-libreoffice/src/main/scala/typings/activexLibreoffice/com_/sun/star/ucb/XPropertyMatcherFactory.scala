package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an {@link XPropertyMatcher} , given a set of search criteria. */
trait XPropertyMatcherFactory extends XInterface {
  /**
    * Creates an {@link XPropertyMatcher} .
    * @param Criteria The set of search criteria the returned {@link XPropertyMatcher} will use.
    * @returns An {@link XPropertyMatcher} with the given search criteria.
    */
  def createPropertyMatcher(Criteria: SeqEquiv[SearchCriterium]): XPropertyMatcher
}

object XPropertyMatcherFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createPropertyMatcher: SeqEquiv[SearchCriterium] => XPropertyMatcher,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyMatcherFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createPropertyMatcher = js.Any.fromFunction1(createPropertyMatcher), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyMatcherFactory]
  }
}

