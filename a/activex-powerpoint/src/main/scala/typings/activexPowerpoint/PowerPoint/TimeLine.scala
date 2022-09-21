package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeLine extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val InteractiveSequences: Sequences
  
  val MainSequence: Sequence
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.TimeLine_typekey")
  var PowerPointDotTimeLine_typekey: TimeLine
}
object TimeLine {
  
  inline def apply(
    Application: Application,
    InteractiveSequences: Sequences,
    MainSequence: Sequence,
    Parent: Any,
    PowerPointDotTimeLine_typekey: TimeLine
  ): TimeLine = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], InteractiveSequences = InteractiveSequences.asInstanceOf[js.Any], MainSequence = MainSequence.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TimeLine_typekey")(PowerPointDotTimeLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLine]
  }
  
  extension [Self <: TimeLine](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setInteractiveSequences(value: Sequences): Self = StObject.set(x, "InteractiveSequences", value.asInstanceOf[js.Any])
    
    inline def setMainSequence(value: Sequence): Self = StObject.set(x, "MainSequence", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTimeLine_typekey(value: TimeLine): Self = StObject.set(x, "PowerPoint.TimeLine_typekey", value.asInstanceOf[js.Any])
  }
}
