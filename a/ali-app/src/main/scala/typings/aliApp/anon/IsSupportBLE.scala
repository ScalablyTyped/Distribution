package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSupportBLE extends StObject {
  
  /**
    * 是否支持 BLE
    */
  var isSupportBLE: Boolean = js.native
}
object IsSupportBLE {
  
  @scala.inline
  def apply(isSupportBLE: Boolean): IsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupportBLE]
  }
  
  @scala.inline
  implicit class IsSupportBLEMutableBuilder[Self <: IsSupportBLE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSupportBLE(value: Boolean): Self = StObject.set(x, "isSupportBLE", value.asInstanceOf[js.Any])
  }
}
