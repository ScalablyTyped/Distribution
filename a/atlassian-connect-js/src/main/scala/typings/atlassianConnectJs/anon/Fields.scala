package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var fields: js.Object
  
  var issueType: Double
  
  var pid: Double
}
object Fields {
  
  inline def apply(fields: js.Object, issueType: Double, pid: Double): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], issueType = issueType.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIssueType(value: Double): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
  }
}
