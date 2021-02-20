package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCaption extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoInsert: Boolean = js.native
  
  var CaptionLabel: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Index: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.AutoCaption_typekey")
  var WordDotAutoCaption_typekey: AutoCaption = js.native
}
object AutoCaption {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoInsert: Boolean,
    CaptionLabel: js.Any,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotAutoCaption_typekey: AutoCaption
  ): AutoCaption = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoInsert = AutoInsert.asInstanceOf[js.Any], CaptionLabel = CaptionLabel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaption_typekey")(WordDotAutoCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaption]
  }
  
  @scala.inline
  implicit class AutoCaptionMutableBuilder[Self <: AutoCaption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInsert(value: Boolean): Self = StObject.set(x, "AutoInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionLabel(value: js.Any): Self = StObject.set(x, "CaptionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoCaption_typekey(value: AutoCaption): Self = StObject.set(x, "Word.AutoCaption_typekey", value.asInstanceOf[js.Any])
  }
}
