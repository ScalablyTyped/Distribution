package typings.activexStdole.stdole

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GUID extends js.Object {
  
  val Data1: Double = js.native
  
  val Data2: Double = js.native
  
  val Data3: Double = js.native
  
  val Data4: SafeArray[Double] = js.native
}
object GUID {
  
  @scala.inline
  def apply(Data1: Double, Data2: Double, Data3: Double, Data4: SafeArray[Double]): GUID = {
    val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any])
    __obj.asInstanceOf[GUID]
  }
  
  @scala.inline
  implicit class GUIDOps[Self <: GUID] (val x: Self) extends AnyVal {
    
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
    def setData1(value: Double): Self = this.set("Data1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData2(value: Double): Self = this.set("Data2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData3(value: Double): Self = this.set("Data3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData4(value: SafeArray[Double]): Self = this.set("Data4", value.asInstanceOf[js.Any])
  }
}
