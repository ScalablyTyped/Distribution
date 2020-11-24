package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a homogeneous matrix by three homogeneous lines */
@js.native
trait HomogenMatrix3 extends js.Object {
  
  var Line1: HomogenMatrixLine3 = js.native
  
  var Line2: HomogenMatrixLine3 = js.native
  
  var Line3: HomogenMatrixLine3 = js.native
}
object HomogenMatrix3 {
  
  @scala.inline
  def apply(Line1: HomogenMatrixLine3, Line2: HomogenMatrixLine3, Line3: HomogenMatrixLine3): HomogenMatrix3 = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix3]
  }
  
  @scala.inline
  implicit class HomogenMatrix3Ops[Self <: HomogenMatrix3] (val x: Self) extends AnyVal {
    
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
    def setLine1(value: HomogenMatrixLine3): Self = this.set("Line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: HomogenMatrixLine3): Self = this.set("Line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine3(value: HomogenMatrixLine3): Self = this.set("Line3", value.asInstanceOf[js.Any])
  }
}
