package typings.athenajs.anon

import typings.athenajs.athenajsNumbers.`13`
import typings.athenajs.athenajsNumbers.`17`
import typings.athenajs.athenajsNumbers.`27`
import typings.athenajs.athenajsNumbers.`37`
import typings.athenajs.athenajsNumbers.`38`
import typings.athenajs.athenajsNumbers.`39`
import typings.athenajs.athenajsNumbers.`40`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CTRL extends js.Object {
  
  var CTRL: `17` = js.native
  
  var DOWN: `40` = js.native
  
  var ENTER: `13` = js.native
  
  var ESCAPE: `27` = js.native
  
  var LEFT: `37` = js.native
  
  var RIGHT: `39` = js.native
  
  var SPACE: typings.athenajs.athenajsNumbers.`32` = js.native
  
  var UP: `38` = js.native
}
object CTRL {
  
  @scala.inline
  def apply(
    CTRL: `17`,
    DOWN: `40`,
    ENTER: `13`,
    ESCAPE: `27`,
    LEFT: `37`,
    RIGHT: `39`,
    SPACE: typings.athenajs.athenajsNumbers.`32`,
    UP: `38`
  ): CTRL = {
    val __obj = js.Dynamic.literal(CTRL = CTRL.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTRL]
  }
  
  @scala.inline
  implicit class CTRLOps[Self <: CTRL] (val x: Self) extends AnyVal {
    
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
    def setCTRL(value: `17`): Self = this.set("CTRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOWN(value: `40`): Self = this.set("DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTER(value: `13`): Self = this.set("ENTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setESCAPE(value: `27`): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT(value: `37`): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT(value: `39`): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPACE(value: typings.athenajs.athenajsNumbers.`32`): Self = this.set("SPACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUP(value: `38`): Self = this.set("UP", value.asInstanceOf[js.Any])
  }
}
