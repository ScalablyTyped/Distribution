package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeLine extends StObject {
  
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
  implicit class TimeLineMutableBuilder[Self <: TimeLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveSequences(value: Sequences): Self = StObject.set(x, "InteractiveSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainSequence(value: Sequence): Self = StObject.set(x, "MainSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTimeLine_typekey(value: TimeLine): Self = StObject.set(x, "PowerPoint.TimeLine_typekey", value.asInstanceOf[js.Any])
  }
}
