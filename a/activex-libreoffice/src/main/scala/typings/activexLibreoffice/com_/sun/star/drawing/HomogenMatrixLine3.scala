package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single line for a {@link HomogenMatrix3} . */
@js.native
trait HomogenMatrixLine3 extends js.Object {
  
  var Column1: Double = js.native
  
  var Column2: Double = js.native
  
  var Column3: Double = js.native
}
object HomogenMatrixLine3 {
  
  @scala.inline
  def apply(Column1: Double, Column2: Double, Column3: Double): HomogenMatrixLine3 = {
    val __obj = js.Dynamic.literal(Column1 = Column1.asInstanceOf[js.Any], Column2 = Column2.asInstanceOf[js.Any], Column3 = Column3.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrixLine3]
  }
  
  @scala.inline
  implicit class HomogenMatrixLine3Ops[Self <: HomogenMatrixLine3] (val x: Self) extends AnyVal {
    
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
    def setColumn1(value: Double): Self = this.set("Column1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn2(value: Double): Self = this.set("Column2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn3(value: Double): Self = this.set("Column3", value.asInstanceOf[js.Any])
  }
}
