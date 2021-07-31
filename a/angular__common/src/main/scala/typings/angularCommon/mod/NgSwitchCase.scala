package typings.angularCommon.mod

import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgSwitchCase")
@js.native
class NgSwitchCase protected ()
  extends StObject
     with DoCheck {
  def this(viewContainer: ViewContainerRef, templateRef: TemplateRef[js.Object], ngSwitch: NgSwitch) = this()
  
  var _view: js.Any = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
  
  var ngSwitch: js.Any = js.native
  
  /**
    * Stores the HTML template to be selected on match.
    */
  var ngSwitchCase: js.Any = js.native
}
