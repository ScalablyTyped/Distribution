package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBox extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoSize: Boolean = js.native
  
  val Creator: Double = js.native
  
  var Default: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var Size: Double = js.native
  
  val Valid: Boolean = js.native
  
  var Value: Boolean = js.native
  
  @JSName("Word.CheckBox_typekey")
  var WordDotCheckBox_typekey: CheckBox = js.native
}
object CheckBox {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoSize: Boolean,
    Creator: Double,
    Default: Boolean,
    Parent: js.Any,
    Size: Double,
    Valid: Boolean,
    Value: Boolean,
    WordDotCheckBox_typekey: CheckBox
  ): CheckBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CheckBox_typekey")(WordDotCheckBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
  
  @scala.inline
  implicit class CheckBoxMutableBuilder[Self <: CheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCheckBox_typekey(value: CheckBox): Self = StObject.set(x, "Word.CheckBox_typekey", value.asInstanceOf[js.Any])
  }
}
