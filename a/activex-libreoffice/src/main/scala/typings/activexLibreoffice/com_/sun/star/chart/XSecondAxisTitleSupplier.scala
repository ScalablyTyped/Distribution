package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSecondAxisTitleSupplier extends XInterface {
  
  val SecondXAxisTitle: XShape = js.native
  
  val SecondYAxisTitle: XShape = js.native
  
  def getSecondXAxisTitle(): XShape = js.native
  
  def getSecondYAxisTitle(): XShape = js.native
}
object XSecondAxisTitleSupplier {
  
  @scala.inline
  def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: () => Unit,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
  
  @scala.inline
  implicit class XSecondAxisTitleSupplierOps[Self <: XSecondAxisTitleSupplier] (val x: Self) extends AnyVal {
    
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
    def setSecondXAxisTitle(value: XShape): Self = this.set("SecondXAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondYAxisTitle(value: XShape): Self = this.set("SecondYAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSecondXAxisTitle(value: () => XShape): Self = this.set("getSecondXAxisTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecondYAxisTitle(value: () => XShape): Self = this.set("getSecondYAxisTitle", js.Any.fromFunction0(value))
  }
}
