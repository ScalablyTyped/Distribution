package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomActionURLOperation extends StObject {
  
  /**
    * The target of the CustomActionURLOperation. Valid values are defined as follows:    NEW_TAB: Opens the target URL in a new browser tab.    NEW_WINDOW: Opens the target URL in a new browser window.    SAME_TAB: Opens the target URL in the same browser tab.  
    */
  var URLTarget: URLTargetConfiguration
  
  /**
    * THe URL link of the CustomActionURLOperation.
    */
  var URLTemplate: URLOperationTemplate
}
object CustomActionURLOperation {
  
  inline def apply(URLTarget: URLTargetConfiguration, URLTemplate: URLOperationTemplate): CustomActionURLOperation = {
    val __obj = js.Dynamic.literal(URLTarget = URLTarget.asInstanceOf[js.Any], URLTemplate = URLTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomActionURLOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomActionURLOperation] (val x: Self) extends AnyVal {
    
    inline def setURLTarget(value: URLTargetConfiguration): Self = StObject.set(x, "URLTarget", value.asInstanceOf[js.Any])
    
    inline def setURLTemplate(value: URLOperationTemplate): Self = StObject.set(x, "URLTemplate", value.asInstanceOf[js.Any])
  }
}
