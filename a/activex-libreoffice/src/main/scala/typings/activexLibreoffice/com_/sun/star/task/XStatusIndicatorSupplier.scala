package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
@js.native
trait XStatusIndicatorSupplier extends XInterface {
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  val StatusIndicator: XStatusIndicator = js.native
  
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  def getStatusIndicator(): XStatusIndicator = js.native
}
object XStatusIndicatorSupplier {
  
  @scala.inline
  def apply(
    StatusIndicator: XStatusIndicator,
    acquire: () => Unit,
    getStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatusIndicator = js.Any.fromFunction0(getStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
  
  @scala.inline
  implicit class XStatusIndicatorSupplierOps[Self <: XStatusIndicatorSupplier] (val x: Self) extends AnyVal {
    
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
    def setStatusIndicator(value: XStatusIndicator): Self = this.set("StatusIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStatusIndicator(value: () => XStatusIndicator): Self = this.set("getStatusIndicator", js.Any.fromFunction0(value))
  }
}
