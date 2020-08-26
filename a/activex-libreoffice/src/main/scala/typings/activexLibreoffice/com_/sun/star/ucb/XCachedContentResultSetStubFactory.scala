package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a {@link CachedContentResultSetStub} . */
@js.native
trait XCachedContentResultSetStubFactory extends XInterface {
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link ContentResultSet} .
    * @returns an instance of service {@link CachedContentResultSetStub} .
    */
  def createCachedContentResultSetStub(xSource: XResultSet): XResultSet = js.native
}

object XCachedContentResultSetStubFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCachedContentResultSetStub: XResultSet => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedContentResultSetStubFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSetStub = js.Any.fromFunction1(createCachedContentResultSetStub), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedContentResultSetStubFactory]
  }
  @scala.inline
  implicit class XCachedContentResultSetStubFactoryOps[Self <: XCachedContentResultSetStubFactory] (val x: Self) extends AnyVal {
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
    def setCreateCachedContentResultSetStub(value: XResultSet => XResultSet): Self = this.set("createCachedContentResultSetStub", js.Any.fromFunction1(value))
  }
  
}

