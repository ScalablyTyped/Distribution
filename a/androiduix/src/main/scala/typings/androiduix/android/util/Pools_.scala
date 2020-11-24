package typings.androiduix.android.util

import typings.androiduix.android.util.Pools.SimplePool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pools_ extends js.Object {
  
  var a: SimplePool[String] = js.native
}
object Pools_ {
  
  @scala.inline
  def apply(a: SimplePool[String]): Pools_ = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pools_]
  }
  
  @scala.inline
  implicit class Pools_Ops[Self <: Pools_] (val x: Self) extends AnyVal {
    
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
    def setA(value: SimplePool[String]): Self = this.set("a", value.asInstanceOf[js.Any])
  }
}
