package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileTime extends StObject {
  
  /**
    * The start time of a profile. It is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var start: js.UndefOr[js.Date] = js.undefined
}
object ProfileTime {
  
  inline def apply(): ProfileTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileTime]
  }
  
  extension [Self <: ProfileTime](x: Self) {
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
