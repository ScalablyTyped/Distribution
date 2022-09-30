package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgControl")
@js.native
abstract class NgControl () extends AbstractControlDirective {
  
  /**
    * @description
    * The name for the control
    */
  var name: String | Double | Null = js.native
  
  /**
    * @description
    * The value accessor for the control
    */
  var valueAccessor: ControlValueAccessor | Null = js.native
  
  /**
    * @description
    * The callback method to update the model from the view when requested
    *
    * @param newValue The new value for the view
    */
  def viewToModelUpdate(newValue: Any): Unit = js.native
}
