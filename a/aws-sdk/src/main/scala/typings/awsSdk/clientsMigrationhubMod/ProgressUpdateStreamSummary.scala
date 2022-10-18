package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressUpdateStreamSummary extends StObject {
  
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined
}
object ProgressUpdateStreamSummary {
  
  inline def apply(): ProgressUpdateStreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressUpdateStreamSummary]
  }
  
  extension [Self <: ProgressUpdateStreamSummary](x: Self) {
    
    inline def setProgressUpdateStreamName(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStreamName", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStreamNameUndefined: Self = StObject.set(x, "ProgressUpdateStreamName", js.undefined)
  }
}
