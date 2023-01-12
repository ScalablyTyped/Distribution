package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddonHealth extends StObject {
  
  /**
    * An object representing the health issues for an add-on.
    */
  var issues: js.UndefOr[AddonIssueList] = js.undefined
}
object AddonHealth {
  
  inline def apply(): AddonHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddonHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddonHealth] (val x: Self) extends AnyVal {
    
    inline def setIssues(value: AddonIssueList): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: AddonIssue*): Self = StObject.set(x, "issues", js.Array(value*))
  }
}
