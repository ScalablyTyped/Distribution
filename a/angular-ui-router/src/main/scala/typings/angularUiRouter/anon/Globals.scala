package typings.angularUiRouter.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Globals extends js.Object {
  
  /**
    * Currently resolved "resolve" values from the current state
    */
  var globals: StringDictionary[js.Any] = js.native
}
object Globals {
  
  @scala.inline
  def apply(globals: StringDictionary[js.Any]): Globals = {
    val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globals]
  }
  
  @scala.inline
  implicit class GlobalsOps[Self <: Globals] (val x: Self) extends AnyVal {
    
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
    def setGlobals(value: StringDictionary[js.Any]): Self = this.set("globals", value.asInstanceOf[js.Any])
  }
}
