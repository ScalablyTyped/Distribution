package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationRevisionInput extends StObject {
  
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: ApplicationName
  
  /**
    * Information about the application revision to get, including type and location.
    */
  var revision: RevisionLocation
}
object GetApplicationRevisionInput {
  
  inline def apply(applicationName: ApplicationName, revision: RevisionLocation): GetApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRevisionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationRevisionInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: RevisionLocation): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
