package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagRecognizer extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Caption: String = js.native
  
  val Creator: Double = js.native
  
  var Enabled: Boolean = js.native
  
  val FullName: String = js.native
  
  val Parent: js.Any = js.native
  
  val ProgID: String = js.native
  
  @JSName("Word.SmartTagRecognizer_typekey")
  var WordDotSmartTagRecognizer_typekey: SmartTagRecognizer = js.native
}
object SmartTagRecognizer {
  
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: Double,
    Enabled: Boolean,
    FullName: String,
    Parent: js.Any,
    ProgID: String,
    WordDotSmartTagRecognizer_typekey: SmartTagRecognizer
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProgID = ProgID.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagRecognizer_typekey")(WordDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
  
  @scala.inline
  implicit class SmartTagRecognizerMutableBuilder[Self <: SmartTagRecognizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgID(value: String): Self = StObject.set(x, "ProgID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSmartTagRecognizer_typekey(value: SmartTagRecognizer): Self = StObject.set(x, "Word.SmartTagRecognizer_typekey", value.asInstanceOf[js.Any])
  }
}
