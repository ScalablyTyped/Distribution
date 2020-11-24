package typings.athenajs.anon

import typings.athenajs.athenajsNumbers.`10`
import typings.athenajs.athenajsNumbers.`11`
import typings.athenajs.athenajsNumbers.`12`
import typings.athenajs.athenajsNumbers.`13`
import typings.athenajs.athenajsNumbers.`14`
import typings.athenajs.athenajsNumbers.`15`
import typings.athenajs.athenajsNumbers.`1`
import typings.athenajs.athenajsNumbers.`2`
import typings.athenajs.athenajsNumbers.`3`
import typings.athenajs.athenajsNumbers.`4`
import typings.athenajs.athenajsNumbers.`5`
import typings.athenajs.athenajsNumbers.`6`
import typings.athenajs.athenajsNumbers.`7`
import typings.athenajs.athenajsNumbers.`8`
import typings.athenajs.athenajsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends js.Object {
  
  var `32`: `1` = js.native
  
  var `37`: `14` = js.native
  
  var `38`: `12` = js.native
  
  var `39`: `15` = js.native
  
   // Directional (discrete) pad
  var `40`: `13` = js.native
  
   // Face (main) buttons
  var FACE_0: `1` = js.native
  
  var FACE_3: `2` = js.native
  
  var FACE_4: `3` = js.native
  
  var LEFT_ANALOGUE_STICK: `10` = js.native
  
  var LEFT_SHOULDER: `4` = js.native
  
  var LEFT_SHOULDER_BOTTOM: `6` = js.native
  
   // Analogue sticks (if depressible)
  var RIGHT_ANALOGUE_STICK: `11` = js.native
  
   // Top shoulder buttons
  var RIGHT_SHOULDER: `5` = js.native
  
   // Bottom shoulder buttons
  var RIGHT_SHOULDER_BOTTOM: `7` = js.native
  
  var SELECT: `8` = js.native
  
  var START: `9` = js.native
}
object `32` {
  
  @scala.inline
  def apply(
    `32`: `1`,
    `37`: `14`,
    `38`: `12`,
    `39`: `15`,
    `40`: `13`,
    FACE_0: `1`,
    FACE_3: `2`,
    FACE_4: `3`,
    LEFT_ANALOGUE_STICK: `10`,
    LEFT_SHOULDER: `4`,
    LEFT_SHOULDER_BOTTOM: `6`,
    RIGHT_ANALOGUE_STICK: `11`,
    RIGHT_SHOULDER: `5`,
    RIGHT_SHOULDER_BOTTOM: `7`,
    SELECT: `8`,
    START: `9`
  ): `32` = {
    val __obj = js.Dynamic.literal(FACE_0 = FACE_0.asInstanceOf[js.Any], FACE_3 = FACE_3.asInstanceOf[js.Any], FACE_4 = FACE_4.asInstanceOf[js.Any], LEFT_ANALOGUE_STICK = LEFT_ANALOGUE_STICK.asInstanceOf[js.Any], LEFT_SHOULDER = LEFT_SHOULDER.asInstanceOf[js.Any], LEFT_SHOULDER_BOTTOM = LEFT_SHOULDER_BOTTOM.asInstanceOf[js.Any], RIGHT_ANALOGUE_STICK = RIGHT_ANALOGUE_STICK.asInstanceOf[js.Any], RIGHT_SHOULDER = RIGHT_SHOULDER.asInstanceOf[js.Any], RIGHT_SHOULDER_BOTTOM = RIGHT_SHOULDER_BOTTOM.asInstanceOf[js.Any], SELECT = SELECT.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any])
    __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    __obj.updateDynamic("37")(`37`.asInstanceOf[js.Any])
    __obj.updateDynamic("38")(`38`.asInstanceOf[js.Any])
    __obj.updateDynamic("39")(`39`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32Ops`[Self <: `32`] (val x: Self) extends AnyVal {
    
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
    def set32(value: `1`): Self = this.set("32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set37(value: `14`): Self = this.set("37", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set38(value: `12`): Self = this.set("38", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set39(value: `15`): Self = this.set("39", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set40(value: `13`): Self = this.set("40", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFACE_0(value: `1`): Self = this.set("FACE_0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFACE_3(value: `2`): Self = this.set("FACE_3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFACE_4(value: `3`): Self = this.set("FACE_4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT_ANALOGUE_STICK(value: `10`): Self = this.set("LEFT_ANALOGUE_STICK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT_SHOULDER(value: `4`): Self = this.set("LEFT_SHOULDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEFT_SHOULDER_BOTTOM(value: `6`): Self = this.set("LEFT_SHOULDER_BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT_ANALOGUE_STICK(value: `11`): Self = this.set("RIGHT_ANALOGUE_STICK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT_SHOULDER(value: `5`): Self = this.set("RIGHT_SHOULDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIGHT_SHOULDER_BOTTOM(value: `7`): Self = this.set("RIGHT_SHOULDER_BOTTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECT(value: `8`): Self = this.set("SELECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: `9`): Self = this.set("START", value.asInstanceOf[js.Any])
  }
}
