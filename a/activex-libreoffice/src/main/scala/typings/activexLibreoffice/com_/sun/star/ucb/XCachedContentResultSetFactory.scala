package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a {@link CachedContentResultSet} . */
@js.native
trait XCachedContentResultSetFactory extends XInterface {
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link CachedContentResultSetStub} .
    * @param xMapping can be used for optimization of remote access via the interface {@link XContentAccess} of the {@link CachedContentResultSet} . This para
    * @returns an instance of service {@link CachedContentResultSet} .
    */
  def createCachedContentResultSet(xSource: XResultSet, xMapping: XContentIdentifierMapping): XResultSet = js.native
}

object XCachedContentResultSetFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCachedContentResultSet: (XResultSet, XContentIdentifierMapping) => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedContentResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSet = js.Any.fromFunction2(createCachedContentResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedContentResultSetFactory]
  }
  @scala.inline
  implicit class XCachedContentResultSetFactoryOps[Self <: XCachedContentResultSetFactory] (val x: Self) extends AnyVal {
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
    def setCreateCachedContentResultSet(value: (XResultSet, XContentIdentifierMapping) => XResultSet): Self = this.set("createCachedContentResultSet", js.Any.fromFunction2(value))
  }
  
}

