package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an {@link XPropertyMatcher} , given a set of search criteria. */
@js.native
trait XPropertyMatcherFactory extends XInterface {
  /**
    * Creates an {@link XPropertyMatcher} .
    * @param Criteria The set of search criteria the returned {@link XPropertyMatcher} will use.
    * @returns An {@link XPropertyMatcher} with the given search criteria.
    */
  def createPropertyMatcher(Criteria: SeqEquiv[SearchCriterium]): XPropertyMatcher = js.native
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
  @scala.inline
  implicit class XPropertyMatcherFactoryOps[Self <: XPropertyMatcherFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatePropertyMatcher(value: SeqEquiv[SearchCriterium] => XPropertyMatcher): Self = this.set("createPropertyMatcher", js.Any.fromFunction1(value))
  }
  
}

