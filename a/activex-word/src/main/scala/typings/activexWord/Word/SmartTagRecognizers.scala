package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagRecognizers extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): SmartTagRecognizer
  
  val Parent: Any
  
  def ReloadRecognizers(): Unit
  
  /* private */ @JSName("Word.SmartTagRecognizers_typekey")
  var WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
}
object SmartTagRecognizers {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => SmartTagRecognizer,
    Parent: Any,
    ReloadRecognizers: () => Unit,
    WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
  ): SmartTagRecognizers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadRecognizers = js.Any.fromFunction0(ReloadRecognizers))
    __obj.updateDynamic("Word.SmartTagRecognizers_typekey")(WordDotSmartTagRecognizers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartTagRecognizers] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => SmartTagRecognizer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReloadRecognizers(value: () => Unit): Self = StObject.set(x, "ReloadRecognizers", js.Any.fromFunction0(value))
    
    inline def setWordDotSmartTagRecognizers_typekey(value: SmartTagRecognizers): Self = StObject.set(x, "Word.SmartTagRecognizers_typekey", value.asInstanceOf[js.Any])
  }
}
