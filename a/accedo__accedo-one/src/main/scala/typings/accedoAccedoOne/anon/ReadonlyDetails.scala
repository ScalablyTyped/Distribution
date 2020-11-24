package typings.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@accedo/accedo-one.@accedo/accedo-one.AccedoLog.Details> */
@js.native
trait ReadonlyDetails extends js.Object {
  
  val dim1: js.UndefOr[String] = js.native
  
  val dim2: js.UndefOr[String] = js.native
  
  val dim3: js.UndefOr[String] = js.native
  
  val dim4: js.UndefOr[String] = js.native
  
  val errorCode: js.UndefOr[Double] = js.native
  
  val message: String = js.native
}
object ReadonlyDetails {
  
  @scala.inline
  def apply(message: String): ReadonlyDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDetails]
  }
  
  @scala.inline
  implicit class ReadonlyDetailsOps[Self <: ReadonlyDetails] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDim1(value: String): Self = this.set("dim1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim1: Self = this.set("dim1", js.undefined)
    
    @scala.inline
    def setDim2(value: String): Self = this.set("dim2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim2: Self = this.set("dim2", js.undefined)
    
    @scala.inline
    def setDim3(value: String): Self = this.set("dim3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim3: Self = this.set("dim3", js.undefined)
    
    @scala.inline
    def setDim4(value: String): Self = this.set("dim4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDim4: Self = this.set("dim4", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
  }
}
