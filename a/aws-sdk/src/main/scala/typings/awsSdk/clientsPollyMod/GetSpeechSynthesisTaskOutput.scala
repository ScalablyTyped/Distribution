package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpeechSynthesisTaskOutput extends StObject {
  
  /**
    * SynthesisTask object that provides information from the requested task, including output format, creation time, task status, and so on.
    */
  var SynthesisTask: js.UndefOr[typings.awsSdk.clientsPollyMod.SynthesisTask] = js.undefined
}
object GetSpeechSynthesisTaskOutput {
  
  inline def apply(): GetSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpeechSynthesisTaskOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSpeechSynthesisTaskOutput] (val x: Self) extends AnyVal {
    
    inline def setSynthesisTask(value: SynthesisTask): Self = StObject.set(x, "SynthesisTask", value.asInstanceOf[js.Any])
    
    inline def setSynthesisTaskUndefined: Self = StObject.set(x, "SynthesisTask", js.undefined)
  }
}
