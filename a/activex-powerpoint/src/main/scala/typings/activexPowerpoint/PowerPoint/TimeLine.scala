package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeLine extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val InteractiveSequences: Sequences = js.native
  
  val MainSequence: Sequence = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TimeLine_typekey")
  var PowerPointDotTimeLine_typekey: TimeLine = js.native
}
object TimeLine {
  
  @scala.inline
  def apply(
    Application: Application,
    InteractiveSequences: Sequences,
    MainSequence: Sequence,
    Parent: js.Any,
    PowerPointDotTimeLine_typekey: TimeLine
  ): TimeLine = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], InteractiveSequences = InteractiveSequences.asInstanceOf[js.Any], MainSequence = MainSequence.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TimeLine_typekey")(PowerPointDotTimeLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLine]
  }
  
  @scala.inline
  implicit class TimeLineOps[Self <: TimeLine] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveSequences(value: Sequences): Self = this.set("InteractiveSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainSequence(value: Sequence): Self = this.set("MainSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTimeLine_typekey(value: TimeLine): Self = this.set("PowerPoint.TimeLine_typekey", value.asInstanceOf[js.Any])
  }
}
