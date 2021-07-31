package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagAction extends StObject {
  
  val ActiveXControl: js.Any
  
  val Application: typings.activexWord.Word.Application
  
  var CheckboxState: Boolean
  
  val Creator: Double
  
  def Execute(): Unit
  
  var ExpandDocumentFragment: Boolean
  
  var ExpandHelp: Boolean
  
  var ListSelection: Double
  
  val Name: String
  
  val Parent: js.Any
  
  val PresentInPane: Boolean
  
  var RadioGroupSelection: Double
  
  var TextboxText: String
  
  val Type: WdSmartTagControlType
  
  @JSName("Word.SmartTagAction_typekey")
  var WordDotSmartTagAction_typekey: SmartTagAction
}
object SmartTagAction {
  
  @scala.inline
  def apply(
    ActiveXControl: js.Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: Double,
    Execute: () => Unit,
    ExpandDocumentFragment: Boolean,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: js.Any,
    PresentInPane: Boolean,
    RadioGroupSelection: Double,
    TextboxText: String,
    Type: WdSmartTagControlType,
    WordDotSmartTagAction_typekey: SmartTagAction
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(ActiveXControl = ActiveXControl.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckboxState = CheckboxState.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), ExpandDocumentFragment = ExpandDocumentFragment.asInstanceOf[js.Any], ExpandHelp = ExpandHelp.asInstanceOf[js.Any], ListSelection = ListSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresentInPane = PresentInPane.asInstanceOf[js.Any], RadioGroupSelection = RadioGroupSelection.asInstanceOf[js.Any], TextboxText = TextboxText.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagAction_typekey")(WordDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  
  @scala.inline
  implicit class SmartTagActionMutableBuilder[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveXControl(value: js.Any): Self = StObject.set(x, "ActiveXControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxState(value: Boolean): Self = StObject.set(x, "CheckboxState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandDocumentFragment(value: Boolean): Self = StObject.set(x, "ExpandDocumentFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandHelp(value: Boolean): Self = StObject.set(x, "ExpandHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelection(value: Double): Self = StObject.set(x, "ListSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentInPane(value: Boolean): Self = StObject.set(x, "PresentInPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupSelection(value: Double): Self = StObject.set(x, "RadioGroupSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextboxText(value: String): Self = StObject.set(x, "TextboxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdSmartTagControlType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Word.SmartTagAction_typekey", value.asInstanceOf[js.Any])
  }
}
