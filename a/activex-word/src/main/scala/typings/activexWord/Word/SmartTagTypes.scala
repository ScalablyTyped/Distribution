package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagTypes extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): SmartTagType
  
  val Parent: js.Any
  
  def ReloadAll(): Unit
  
  @JSName("Word.SmartTagTypes_typekey")
  var WordDotSmartTagTypes_typekey: SmartTagTypes
}
object SmartTagTypes {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => SmartTagType,
    Parent: js.Any,
    ReloadAll: () => Unit,
    WordDotSmartTagTypes_typekey: SmartTagTypes
  ): SmartTagTypes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], ReloadAll = js.Any.fromFunction0(ReloadAll))
    __obj.updateDynamic("Word.SmartTagTypes_typekey")(WordDotSmartTagTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagTypes]
  }
  
  @scala.inline
  implicit class SmartTagTypesMutableBuilder[Self <: SmartTagTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SmartTagType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadAll(value: () => Unit): Self = StObject.set(x, "ReloadAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotSmartTagTypes_typekey(value: SmartTagTypes): Self = StObject.set(x, "Word.SmartTagTypes_typekey", value.asInstanceOf[js.Any])
  }
}
