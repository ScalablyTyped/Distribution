package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndSessionResult extends StObject {
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
}
object EndSessionResult {
  
  inline def apply(): EndSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSessionResult]
  }
  
  extension [Self <: EndSessionResult](x: Self) {
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
  }
}
