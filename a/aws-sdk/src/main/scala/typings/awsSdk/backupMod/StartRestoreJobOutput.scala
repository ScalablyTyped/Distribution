package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRestoreJobOutput extends StObject {
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[typings.awsSdk.backupMod.RestoreJobId] = js.undefined
}
object StartRestoreJobOutput {
  
  inline def apply(): StartRestoreJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRestoreJobOutput]
  }
  
  extension [Self <: StartRestoreJobOutput](x: Self) {
    
    inline def setRestoreJobId(value: RestoreJobId): Self = StObject.set(x, "RestoreJobId", value.asInstanceOf[js.Any])
    
    inline def setRestoreJobIdUndefined: Self = StObject.set(x, "RestoreJobId", js.undefined)
  }
}
