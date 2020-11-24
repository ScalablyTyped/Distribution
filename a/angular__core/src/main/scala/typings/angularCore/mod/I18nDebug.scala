package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nDebug extends js.Object {
  
  /**
    * Human readable representation of the OpCode arrays.
    *
    * NOTE: This property only exists if `ngDevMode` is set to `true` and it is not present in
    * production. Its presence is purely to help debug issue in development, and should not be relied
    * on in production application.
    */
  var debug: js.UndefOr[js.Array[String]] = js.native
}
object I18nDebug {
  
  @scala.inline
  def apply(): I18nDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nDebug]
  }
  
  @scala.inline
  implicit class I18nDebugOps[Self <: I18nDebug] (val x: Self) extends AnyVal {
    
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
    def setDebugVarargs(value: String*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: js.Array[String]): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
}
