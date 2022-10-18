package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedTranscript extends StObject {
  
  /**
    * The content of the transcript that meets the search filter criteria. For the JSON format of the transcript, see Output transcript format.
    */
  var transcript: js.UndefOr[Transcript] = js.undefined
}
object AssociatedTranscript {
  
  inline def apply(): AssociatedTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedTranscript]
  }
  
  extension [Self <: AssociatedTranscript](x: Self) {
    
    inline def setTranscript(value: Transcript): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
  }
}
