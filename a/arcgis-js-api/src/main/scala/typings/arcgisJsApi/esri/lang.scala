package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait lang extends js.Object {
  
  /**
    * Use this method to deeply clone objects with properties that are computed or have their own `clone()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-lang.html#clone)
    */
  def clone(elem: js.Any): js.Any = js.native
}
object lang {
  
  @scala.inline
  def apply(clone: js.Any => js.Any): lang = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone))
    __obj.asInstanceOf[lang]
  }
  
  @scala.inline
  implicit class langOps[Self <: lang] (val x: Self) extends AnyVal {
    
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
    def setClone(value: js.Any => js.Any): Self = this.set("clone", js.Any.fromFunction1(value))
  }
}
