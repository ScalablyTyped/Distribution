package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagActions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): SmartTagAction
  
  val Parent: js.Any
  
  def ReloadActions(): Unit
  
  @JSName("Word.SmartTagActions_typekey")
  var WordDotSmartTagActions_typekey: SmartTagActions
}
object SmartTagActions {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagAction,
    Parent: js.Any,
    ReloadActions: () => Unit,
    WordDotSmartTagActions_typekey: SmartTagActions
  ): SmartTagActions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadActions = js.Any.fromFunction0(ReloadActions))
    __obj.updateDynamic("Word.SmartTagActions_typekey")(WordDotSmartTagActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagActions]
  }
  
  @scala.inline
  implicit class SmartTagActionsMutableBuilder[Self <: SmartTagActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SmartTagAction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadActions(value: () => Unit): Self = StObject.set(x, "ReloadActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotSmartTagActions_typekey(value: SmartTagActions): Self = StObject.set(x, "Word.SmartTagActions_typekey", value.asInstanceOf[js.Any])
  }
}
