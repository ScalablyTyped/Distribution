package typings.assemblyscriptLoader.mod

import typings.assemblyscriptLoader.anon.Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WebAssembly imports with two levels of nesting. */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait ImportsObject extends js.Object {
  
  var env: js.UndefOr[Abort] = js.native
}
object ImportsObject {
  
  @scala.inline
  def apply(): ImportsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportsObject]
  }
  
  @scala.inline
  implicit class ImportsObjectOps[Self <: ImportsObject] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: Abort): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
  }
}
