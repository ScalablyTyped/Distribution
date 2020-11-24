package typings.angularBlockUi.mod.blockUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockUIInstances extends js.Object {
  
  def get(id: String): BlockUIService = js.native
}
object BlockUIInstances {
  
  @scala.inline
  def apply(get: String => BlockUIService): BlockUIInstances = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[BlockUIInstances]
  }
  
  @scala.inline
  implicit class BlockUIInstancesOps[Self <: BlockUIInstances] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => BlockUIService): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
