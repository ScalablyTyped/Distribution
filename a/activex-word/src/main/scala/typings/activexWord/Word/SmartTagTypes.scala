package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagTypes extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): SmartTagType = js.native
  
  val Parent: js.Any = js.native
  
  def ReloadAll(): Unit = js.native
  
  @JSName("Word.SmartTagTypes_typekey")
  var WordDotSmartTagTypes_typekey: SmartTagTypes = js.native
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
  implicit class SmartTagTypesOps[Self <: SmartTagTypes] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SmartTagType): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadAll(value: () => Unit): Self = this.set("ReloadAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotSmartTagTypes_typekey(value: SmartTagTypes): Self = this.set("Word.SmartTagTypes_typekey", value.asInstanceOf[js.Any])
  }
}
