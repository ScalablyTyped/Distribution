package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpeakerSearchTaskResponse extends StObject {
  
  /**
    * The details of the speaker search task.
    */
  var SpeakerSearchTask: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SpeakerSearchTask] = js.undefined
}
object GetSpeakerSearchTaskResponse {
  
  inline def apply(): GetSpeakerSearchTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpeakerSearchTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSpeakerSearchTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setSpeakerSearchTask(value: SpeakerSearchTask): Self = StObject.set(x, "SpeakerSearchTask", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSearchTaskUndefined: Self = StObject.set(x, "SpeakerSearchTask", js.undefined)
  }
}
