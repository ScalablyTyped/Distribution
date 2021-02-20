package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathAutoCorrectEntry extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  var Value: String = js.native
  
  @JSName("Word.OMathAutoCorrectEntry_typekey")
  var WordDotOMathAutoCorrectEntry_typekey: OMathAutoCorrectEntry = js.native
}
object OMathAutoCorrectEntry {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotOMathAutoCorrectEntry_typekey: OMathAutoCorrectEntry
  ): OMathAutoCorrectEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrectEntry_typekey")(WordDotOMathAutoCorrectEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrectEntry]
  }
  
  @scala.inline
  implicit class OMathAutoCorrectEntryMutableBuilder[Self <: OMathAutoCorrectEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathAutoCorrectEntry_typekey(value: OMathAutoCorrectEntry): Self = StObject.set(x, "Word.OMathAutoCorrectEntry_typekey", value.asInstanceOf[js.Any])
  }
}
