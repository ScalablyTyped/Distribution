package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XAggregation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory interface to produce proxy objects.
  * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
  */
@js.native
trait XProxyFactory extends XInterface {
  /**
    * This method creates a new proxy object that acts on behalf of the given target object. ;  The proxy delegates calls to the given target object. In
    * addition, it is aggregatable, thus it is possible to intercept calls on the proxy's interfaces.
    * @param xTarget target object
    * @returns proxy object
    */
  def createProxy(xTarget: XInterface): XAggregation = js.native
}

object XProxyFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createProxy: XInterface => XAggregation,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XProxyFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createProxy = js.Any.fromFunction1(createProxy), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XProxyFactory]
  }
  @scala.inline
  implicit class XProxyFactoryOps[Self <: XProxyFactory] (val x: Self) extends AnyVal {
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
    def setCreateProxy(value: XInterface => XAggregation): Self = this.set("createProxy", js.Any.fromFunction1(value))
  }
  
}

