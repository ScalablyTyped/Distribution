package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedNotebookInstanceUrlInput extends StObject {
  
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
  
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SessionExpirationDurationInSeconds] = js.undefined
}
object CreatePresignedNotebookInstanceUrlInput {
  
  inline def apply(NotebookInstanceName: NotebookInstanceName): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
  
  extension [Self <: CreatePresignedNotebookInstanceUrlInput](x: Self) {
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = StObject.set(x, "SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationDurationInSecondsUndefined: Self = StObject.set(x, "SessionExpirationDurationInSeconds", js.undefined)
  }
}
