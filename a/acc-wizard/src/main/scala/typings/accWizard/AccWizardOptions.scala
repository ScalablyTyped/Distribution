package typings.accWizard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccWizardOptions extends StObject {
  
  /**
    * @summary Class to indicate the active task in sidebar.
    * @type {string}
    */
  var activeClass: String
  
  /**
    * @summary Add next/prev buttons to panels.
    * @type {boolean}
    */
  var addButtons: Boolean
  
  /**
    * @summary Auto-scrolling.
    * @type {boolean}
    */
  var autoScrolling: Boolean
  
  /**
    * @summary Class(es) for back button.
    * @type {string}
    */
  var backClasses: String
  
  /**
    * @summary Text for back button.
    * @type {string}
    */
  var backText: String
  
  /**
    * @summary HTML input type for back button. (default: "reset")
    * @type {string}
    */
  var backType: String
  
  /**
    * @summary Class to indicate task is complete.
    * @type {string}
    */
  var completedClass: String
  
  /**
    * @summary Class(es) for next button.
    * @type {string}
    */
  var nextClasses: String
  
  /**
    * @summary Text for next button.
    * @type {string}
    */
  var nextText: String
  
  /**
    * @summary HTML input type for next button. (default: "submit")
    * @type {string}
    */
  var nextType: String
  
  /**
    * @summary Function to call on back up.
    */
  var onBack: js.Function
  
  /**
    * @summary A chance to hook destruction.
    */
  var onDestroy: js.Function
  
  /**
    * @summary A chance to hook initialization.
    */
  var onInit: js.Function
  
  /**
    * @summary Function to call on next step.
    */
  var onNext: js.Function
  
  /**
    * @summary Selector for task sidebar.
    * @type {string}
    */
  var sidebar: String
  
  /**
    * @summary Class for step buttons within panels.
    * @type {string}
    */
  var stepClass: String
  
  /**
    * @summary Class to indicate task is still pending.
    * @type {string}
    */
  var todoClass: String
}
object AccWizardOptions {
  
  @scala.inline
  def apply(
    activeClass: String,
    addButtons: Boolean,
    autoScrolling: Boolean,
    backClasses: String,
    backText: String,
    backType: String,
    completedClass: String,
    nextClasses: String,
    nextText: String,
    nextType: String,
    onBack: js.Function,
    onDestroy: js.Function,
    onInit: js.Function,
    onNext: js.Function,
    sidebar: String,
    stepClass: String,
    todoClass: String
  ): AccWizardOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass.asInstanceOf[js.Any], addButtons = addButtons.asInstanceOf[js.Any], autoScrolling = autoScrolling.asInstanceOf[js.Any], backClasses = backClasses.asInstanceOf[js.Any], backText = backText.asInstanceOf[js.Any], backType = backType.asInstanceOf[js.Any], completedClass = completedClass.asInstanceOf[js.Any], nextClasses = nextClasses.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], nextType = nextType.asInstanceOf[js.Any], onBack = onBack.asInstanceOf[js.Any], onDestroy = onDestroy.asInstanceOf[js.Any], onInit = onInit.asInstanceOf[js.Any], onNext = onNext.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any], stepClass = stepClass.asInstanceOf[js.Any], todoClass = todoClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccWizardOptions]
  }
  
  @scala.inline
  implicit class AccWizardOptionsMutableBuilder[Self <: AccWizardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddButtons(value: Boolean): Self = StObject.set(x, "addButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrolling(value: Boolean): Self = StObject.set(x, "autoScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackClasses(value: String): Self = StObject.set(x, "backClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackText(value: String): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackType(value: String): Self = StObject.set(x, "backType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedClass(value: String): Self = StObject.set(x, "completedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextClasses(value: String): Self = StObject.set(x, "nextClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextType(value: String): Self = StObject.set(x, "nextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBack(value: js.Function): Self = StObject.set(x, "onBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDestroy(value: js.Function): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInit(value: js.Function): Self = StObject.set(x, "onInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNext(value: js.Function): Self = StObject.set(x, "onNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepClass(value: String): Self = StObject.set(x, "stepClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodoClass(value: String): Self = StObject.set(x, "todoClass", value.asInstanceOf[js.Any])
  }
}
