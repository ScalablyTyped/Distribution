package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapRunStartedEventDetails extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a Map Run that was started.
    */
  var mapRunArn: js.UndefOr[LongArn] = js.undefined
}
object MapRunStartedEventDetails {
  
  inline def apply(): MapRunStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapRunStartedEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapRunStartedEventDetails] (val x: Self) extends AnyVal {
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
    
    inline def setMapRunArnUndefined: Self = StObject.set(x, "mapRunArn", js.undefined)
  }
}
