package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialplanCEP extends StObject {
  
  /**
    * Parameter of current dialplan application.
    */
  var app_data: String
  
  /**
    * Name of current dialplan application.
    */
  var app_name: String
  
  /**
    * Context in the dialplan.
    */
  var context: String
  
  /**
    * Extension in the dialplan.
    */
  var exten: String
  
  /**
    * Priority in the dialplan.
    */
  var priority: Double
}
object DialplanCEP {
  
  @scala.inline
  def apply(app_data: String, app_name: String, context: String, exten: String, priority: Double): DialplanCEP = {
    val __obj = js.Dynamic.literal(app_data = app_data.asInstanceOf[js.Any], app_name = app_name.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialplanCEP]
  }
  
  @scala.inline
  implicit class DialplanCEPMutableBuilder[Self <: DialplanCEP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_data(value: String): Self = StObject.set(x, "app_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExten(value: String): Self = StObject.set(x, "exten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
