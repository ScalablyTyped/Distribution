package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldListIndex extends js.Object {
  
  val FieldListIndex: Double = js.native
}
object FieldListIndex {
  
  @scala.inline
  def apply(FieldListIndex: Double): FieldListIndex = {
    val __obj = js.Dynamic.literal(FieldListIndex = FieldListIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListIndex]
  }
  
  @scala.inline
  implicit class FieldListIndexOps[Self <: FieldListIndex] (val x: Self) extends AnyVal {
    
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
    def setFieldListIndex(value: Double): Self = this.set("FieldListIndex", value.asInstanceOf[js.Any])
  }
}
