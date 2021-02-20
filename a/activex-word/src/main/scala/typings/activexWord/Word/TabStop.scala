package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStop extends StObject {
  
  var Alignment: WdTabAlignment = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: Double = js.native
  
  val CustomTab: Boolean = js.native
  
  var Leader: WdTabLeader = js.native
  
  val Next: TabStop = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  val Previous: TabStop = js.native
  
  @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: TabStop = js.native
}
object TabStop {
  
  @scala.inline
  def apply(
    Alignment: WdTabAlignment,
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    CustomTab: Boolean,
    Leader: WdTabLeader,
    Next: TabStop,
    Parent: js.Any,
    Position: Double,
    Previous: TabStop,
    WordDotTabStop_typekey: TabStop
  ): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], CustomTab = CustomTab.asInstanceOf[js.Any], Leader = Leader.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TabStop_typekey")(WordDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  
  @scala.inline
  implicit class TabStopMutableBuilder[Self <: TabStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: WdTabAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTab(value: Boolean): Self = StObject.set(x, "CustomTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeader(value: WdTabLeader): Self = StObject.set(x, "Leader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TabStop): Self = StObject.set(x, "Next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: TabStop): Self = StObject.set(x, "Previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTabStop_typekey(value: TabStop): Self = StObject.set(x, "Word.TabStop_typekey", value.asInstanceOf[js.Any])
  }
}
