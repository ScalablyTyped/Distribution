package typings.antvAttr.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeCfg extends js.Object {
  
  val callback: js.UndefOr[CallbackType] = js.native
  
  val names: js.UndefOr[js.Array[String]] = js.native
  
  val scales: js.Array[typings.antvScale.mod.Scale] = js.native
  
  val `type`: js.UndefOr[String] = js.native
  
  val values: js.UndefOr[js.Any] = js.native
}
object AttributeCfg {
  
  @scala.inline
  def apply(scales: js.Array[typings.antvScale.mod.Scale]): AttributeCfg = {
    val __obj = js.Dynamic.literal(scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeCfg]
  }
  
  @scala.inline
  implicit class AttributeCfgOps[Self <: AttributeCfg] (val x: Self) extends AnyVal {
    
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
    def setScalesVarargs(value: typings.antvScale.mod.Scale*): Self = this.set("scales", js.Array(value :_*))
    
    @scala.inline
    def setScales(value: js.Array[typings.antvScale.mod.Scale]): Self = this.set("scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: /* repeated */ js.Any => js.Array[js.Any]): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
