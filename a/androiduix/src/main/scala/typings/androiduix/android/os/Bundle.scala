package typings.androiduix.android.os

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle extends js.Object {
  
  def containsKey(key: String): Boolean = js.native
  
  def get(key: String, defaultValue: js.Any): js.Any = js.native
  
  def put(key: String, value: js.Any): Unit = js.native
}
object Bundle {
  
  @scala.inline
  def apply(containsKey: String => Boolean, get: (String, js.Any) => js.Any, put: (String, js.Any) => Unit): Bundle = {
    val __obj = js.Dynamic.literal(containsKey = js.Any.fromFunction1(containsKey), get = js.Any.fromFunction2(get), put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
    
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
    def setContainsKey(value: String => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: (String, js.Any) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPut(value: (String, js.Any) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
  }
}
