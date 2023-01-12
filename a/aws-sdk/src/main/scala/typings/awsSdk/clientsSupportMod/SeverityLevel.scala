package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeverityLevel extends StObject {
  
  /**
    * The code for case severity level. Valid values: low | normal | high | urgent | critical 
    */
  var code: js.UndefOr[SeverityLevelCode] = js.undefined
  
  /**
    * The name of the severity level that corresponds to the severity level code.  The values returned by the API are different from the values that appear in the Amazon Web Services Support Center. For example, the API uses the code low, but the name appears as General guidance in Support Center.  The following are the API code names and how they appear in the console:    low - General guidance    normal - System impaired    high - Production system impaired    urgent - Production system down    critical - Business-critical system down    For more information, see Choosing a severity in the Amazon Web Services Support User Guide.
    */
  var name: js.UndefOr[SeverityLevelName] = js.undefined
}
object SeverityLevel {
  
  inline def apply(): SeverityLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeverityLevel] (val x: Self) extends AnyVal {
    
    inline def setCode(value: SeverityLevelCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: SeverityLevelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
