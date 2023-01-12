package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPreferences extends StObject {
  
  val locale: js.UndefOr[String] = js.undefined
}
object AgentPreferences {
  
  inline def apply(): AgentPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentPreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentPreferences] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
