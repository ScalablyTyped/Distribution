package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarm extends StObject {
  
  /**
    * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of alarms.
    */
  var name: js.UndefOr[AlarmName] = js.undefined
}
object Alarm {
  
  inline def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alarm] (val x: Self) extends AnyVal {
    
    inline def setName(value: AlarmName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
