package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagActions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): SmartTagAction
  
  val Parent: Any
  
  def ReloadActions(): Unit
  
  /* private */ @JSName("Word.SmartTagActions_typekey")
  var WordDotSmartTagActions_typekey: SmartTagActions
}
object SmartTagActions {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => SmartTagAction,
    Parent: Any,
    ReloadActions: () => Unit,
    WordDotSmartTagActions_typekey: SmartTagActions
  ): SmartTagActions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadActions = js.Any.fromFunction0(ReloadActions))
    __obj.updateDynamic("Word.SmartTagActions_typekey")(WordDotSmartTagActions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagActions]
  }
  
  extension [Self <: SmartTagActions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => SmartTagAction): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReloadActions(value: () => Unit): Self = StObject.set(x, "ReloadActions", js.Any.fromFunction0(value))
    
    inline def setWordDotSmartTagActions_typekey(value: SmartTagActions): Self = StObject.set(x, "Word.SmartTagActions_typekey", value.asInstanceOf[js.Any])
  }
}
