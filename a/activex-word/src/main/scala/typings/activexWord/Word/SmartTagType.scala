package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagType extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val FriendlyName: String
  
  val Name: String
  
  val Parent: js.Any
  
  val SmartTagActions: typings.activexWord.Word.SmartTagActions
  
  val SmartTagRecognizers: typings.activexWord.Word.SmartTagRecognizers
  
  @JSName("Word.SmartTagType_typekey")
  var WordDotSmartTagType_typekey: SmartTagType
}
object SmartTagType {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    FriendlyName: String,
    Name: String,
    Parent: js.Any,
    SmartTagActions: SmartTagActions,
    SmartTagRecognizers: SmartTagRecognizers,
    WordDotSmartTagType_typekey: SmartTagType
  ): SmartTagType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SmartTagActions = SmartTagActions.asInstanceOf[js.Any], SmartTagRecognizers = SmartTagRecognizers.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagType_typekey")(WordDotSmartTagType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagType]
  }
  
  @scala.inline
  implicit class SmartTagTypeMutableBuilder[Self <: SmartTagType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartTagActions(value: SmartTagActions): Self = StObject.set(x, "SmartTagActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartTagRecognizers(value: SmartTagRecognizers): Self = StObject.set(x, "SmartTagRecognizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSmartTagType_typekey(value: SmartTagType): Self = StObject.set(x, "Word.SmartTagType_typekey", value.asInstanceOf[js.Any])
  }
}
