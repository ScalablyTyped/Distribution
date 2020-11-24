package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * creates a {@link CachedDynamicResultSet} .
  *
  * Pay attention to instantiate this helper on client side where your want to read the data respectively where you have instantiated the listener to the
  * {@link XDynamicResultSet} .
  *
  * The needed stub on server side can be created using {@link XCachedDynamicResultSetStubFactory} .
  */
@js.native
trait XCachedDynamicResultSetFactory extends XInterface {
  
  /**
    * creates a remote optimizes {@link XDynamicResultSet} .
    * @param SourceStub must be an instance of service {@link CachedDynamicResultSetStub} . It can be `NULL` . In this case you can use the interface {@link X
    * @param ContentIdentifierMapping is not required, but can be set if it is necessary to change the identity of the contents accessible via the interface {
    * @returns an instance of service {@link CachedDynamicResultSet} .
    */
  def createCachedDynamicResultSet(SourceStub: XDynamicResultSet, ContentIdentifierMapping: XContentIdentifierMapping): XDynamicResultSet = js.native
}
object XCachedDynamicResultSetFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCachedDynamicResultSet: (XDynamicResultSet, XContentIdentifierMapping) => XDynamicResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCachedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedDynamicResultSet = js.Any.fromFunction2(createCachedDynamicResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedDynamicResultSetFactory]
  }
  
  @scala.inline
  implicit class XCachedDynamicResultSetFactoryOps[Self <: XCachedDynamicResultSetFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateCachedDynamicResultSet(value: (XDynamicResultSet, XContentIdentifierMapping) => XDynamicResultSet): Self = this.set("createCachedDynamicResultSet", js.Any.fromFunction2(value))
  }
}
