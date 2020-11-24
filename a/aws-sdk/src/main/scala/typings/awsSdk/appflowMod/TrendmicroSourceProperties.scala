package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrendmicroSourceProperties extends js.Object {
  
  /**
    *  The object specified in the Trend Micro flow source. 
    */
  var `object`: Object = js.native
}
object TrendmicroSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): TrendmicroSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendmicroSourceProperties]
  }
  
  @scala.inline
  implicit class TrendmicroSourcePropertiesOps[Self <: TrendmicroSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObject(value: Object): Self = this.set("object", value.asInstanceOf[js.Any])
  }
}
