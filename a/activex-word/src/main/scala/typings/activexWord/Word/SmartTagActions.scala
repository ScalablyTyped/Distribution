package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagActions extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): SmartTagAction = js.native
  
  val Parent: js.Any = js.native
  
  def ReloadActions(): Unit = js.native
  
  @JSName("Word.SmartTagActions_typekey")
  var WordDotSmartTagActions_typekey: SmartTagActions = js.native
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
  implicit class SmartTagActionsOps[Self <: SmartTagActions] (val x: Self) extends AnyVal {
    
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
    def setItem(value: js.Any => SmartTagAction): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadActions(value: () => Unit): Self = this.set("ReloadActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotSmartTagActions_typekey(value: SmartTagActions): Self = this.set("Word.SmartTagActions_typekey", value.asInstanceOf[js.Any])
  }
}
