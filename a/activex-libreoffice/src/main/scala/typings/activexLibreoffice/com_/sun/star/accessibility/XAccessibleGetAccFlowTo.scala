package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAccessibleGetAccFlowTo extends XInterface {
  
  def getAccFlowTo(aXShape: js.Any, nType: Double): SafeArray[_] = js.native
}
object XAccessibleGetAccFlowTo {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAccFlowTo: (js.Any, Double) => SafeArray[_],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
  
  @scala.inline
  implicit class XAccessibleGetAccFlowToOps[Self <: XAccessibleGetAccFlowTo] (val x: Self) extends AnyVal {
    
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
    def setGetAccFlowTo(value: (js.Any, Double) => SafeArray[_]): Self = this.set("getAccFlowTo", js.Any.fromFunction2(value))
  }
}
