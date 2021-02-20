package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagRecognizers extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): SmartTagRecognizer = js.native
  
  val Parent: js.Any = js.native
  
  def ReloadRecognizers(): Unit = js.native
  
  @JSName("Word.SmartTagRecognizers_typekey")
  var WordDotSmartTagRecognizers_typekey: SmartTagRecognizers = js.native
}
object SmartTagRecognizers {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagRecognizer,
    Parent: js.Any,
    ReloadRecognizers: () => Unit,
    WordDotSmartTagRecognizers_typekey: SmartTagRecognizers
  ): SmartTagRecognizers = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadRecognizers = js.Any.fromFunction0(ReloadRecognizers))
    __obj.updateDynamic("Word.SmartTagRecognizers_typekey")(WordDotSmartTagRecognizers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizers]
  }
  
  @scala.inline
  implicit class SmartTagRecognizersMutableBuilder[Self <: SmartTagRecognizers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SmartTagRecognizer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadRecognizers(value: () => Unit): Self = StObject.set(x, "ReloadRecognizers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotSmartTagRecognizers_typekey(value: SmartTagRecognizers): Self = StObject.set(x, "Word.SmartTagRecognizers_typekey", value.asInstanceOf[js.Any])
  }
}
