package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositorySyncStatusOutput extends StObject {
  
  /**
    * The repository sync status detail data that's returned by Proton.
    */
  var latestSync: js.UndefOr[RepositorySyncAttempt] = js.undefined
}
object GetRepositorySyncStatusOutput {
  
  inline def apply(): GetRepositorySyncStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositorySyncStatusOutput]
  }
  
  extension [Self <: GetRepositorySyncStatusOutput](x: Self) {
    
    inline def setLatestSync(value: RepositorySyncAttempt): Self = StObject.set(x, "latestSync", value.asInstanceOf[js.Any])
    
    inline def setLatestSyncUndefined: Self = StObject.set(x, "latestSync", js.undefined)
  }
}
