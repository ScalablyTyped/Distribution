package typings.activexLibreoffice.com_.sun.star.uno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies an universal interface key (globally unique).
  *
  * This struct is deprecated. Uiks are not used anymore.
  * @deprecated Deprecated
  */
@js.native
trait Uik extends js.Object {
  
  /** specifies a 4 byte data block. */
  var Data1: Double = js.native
  
  /** specifies a 2 byte data block. */
  var Data2: Double = js.native
  
  /** specifies a 2 byte data block. */
  var Data3: Double = js.native
  
  /** specifies a 4 byte data block. */
  var Data4: Double = js.native
  
  /** specifies a 4 byte data block. */
  var Data5: Double = js.native
}
object Uik {
  
  @scala.inline
  def apply(Data1: Double, Data2: Double, Data3: Double, Data4: Double, Data5: Double): Uik = {
    val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any], Data5 = Data5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uik]
  }
  
  @scala.inline
  implicit class UikOps[Self <: Uik] (val x: Self) extends AnyVal {
    
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
    def setData4(value: Double): Self = this.set("Data4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData5(value: Double): Self = this.set("Data5", value.asInstanceOf[js.Any])
  }
}
