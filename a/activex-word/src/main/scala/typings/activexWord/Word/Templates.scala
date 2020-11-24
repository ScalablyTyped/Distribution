package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Template = js.native
  
  def LoadBuildingBlocks(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Templates_typekey")
  var WordDotTemplates_typekey: Templates = js.native
}
object Templates {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Template,
    LoadBuildingBlocks: () => Unit,
    Parent: js.Any,
    WordDotTemplates_typekey: Templates
  ): Templates = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), LoadBuildingBlocks = js.Any.fromFunction0(LoadBuildingBlocks), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Templates_typekey")(WordDotTemplates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates]
  }
  
  @scala.inline
  implicit class TemplatesOps[Self <: Templates] (val x: Self) extends AnyVal {
    
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
    def setItem(value: js.Any => Template): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadBuildingBlocks(value: () => Unit): Self = this.set("LoadBuildingBlocks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTemplates_typekey(value: Templates): Self = this.set("Word.Templates_typekey", value.asInstanceOf[js.Any])
  }
}
