package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingInformation extends StObject {
  
  /**
    * The amount of time that QLDB spent on processing the command, measured in milliseconds.
    */
  var ProcessingTimeMilliseconds: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.ProcessingTimeMilliseconds] = js.undefined
}
object TimingInformation {
  
  inline def apply(): TimingInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimingInformation] (val x: Self) extends AnyVal {
    
    inline def setProcessingTimeMilliseconds(value: ProcessingTimeMilliseconds): Self = StObject.set(x, "ProcessingTimeMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMillisecondsUndefined: Self = StObject.set(x, "ProcessingTimeMilliseconds", js.undefined)
  }
}
