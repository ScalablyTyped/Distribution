package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationEvents extends StObject {
  
  /* private */ @JSName("InfoPath.ApplicationEvents_typekey")
  var InfoPathDotApplicationEvents_typekey: ApplicationEvents
}
object ApplicationEvents {
  
  inline def apply(InfoPathDotApplicationEvents_typekey: ApplicationEvents): ApplicationEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.ApplicationEvents_typekey")(InfoPathDotApplicationEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationEvents] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotApplicationEvents_typekey(value: ApplicationEvents): Self = StObject.set(x, "InfoPath.ApplicationEvents_typekey", value.asInstanceOf[js.Any])
  }
}
