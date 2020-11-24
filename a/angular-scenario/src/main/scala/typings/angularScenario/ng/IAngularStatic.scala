package typings.angularScenario.ng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAngularStatic extends js.Object {
  
  var scenario: js.Any = js.native
}
object IAngularStatic {
  
  @scala.inline
  def apply(scenario: js.Any): IAngularStatic = {
    val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAngularStatic]
  }
  
  @scala.inline
  implicit class IAngularStaticOps[Self <: IAngularStatic] (val x: Self) extends AnyVal {
    
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
    def setScenario(value: js.Any): Self = this.set("scenario", value.asInstanceOf[js.Any])
  }
}
