package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Templates extends StObject {
  
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
  implicit class TemplatesMutableBuilder[Self <: Templates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Template): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadBuildingBlocks(value: () => Unit): Self = StObject.set(x, "LoadBuildingBlocks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTemplates_typekey(value: Templates): Self = StObject.set(x, "Word.Templates_typekey", value.asInstanceOf[js.Any])
  }
}
