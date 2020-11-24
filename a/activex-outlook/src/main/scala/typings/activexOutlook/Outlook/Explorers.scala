package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explorers extends js.Object {
  
  def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): Explorer = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Explorer = js.native
  
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object Explorers {
  
  @scala.inline
  def apply(
    Add: (js.Any, OlFolderDisplayMode) => Explorer,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Explorer,
    OutlookDotExplorers_typekey: Explorers,
    Parent: js.Any,
    Session: NameSpace
  ): Explorers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorers_typekey")(OutlookDotExplorers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorers]
  }
  
  @scala.inline
  implicit class ExplorersOps[Self <: Explorers] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (js.Any, OlFolderDisplayMode) => Explorer): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Explorer): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotExplorers_typekey(value: Explorers): Self = this.set("Outlook.Explorers_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
}
