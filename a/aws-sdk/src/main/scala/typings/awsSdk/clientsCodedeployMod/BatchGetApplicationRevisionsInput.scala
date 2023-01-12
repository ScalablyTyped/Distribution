package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetApplicationRevisionsInput extends StObject {
  
  /**
    * The name of an CodeDeploy application about which to get revision information.
    */
  var applicationName: ApplicationName
  
  /**
    * An array of RevisionLocation objects that specify information to get about the application revisions, including type and location. The maximum number of RevisionLocation objects you can specify is 25.
    */
  var revisions: RevisionLocationList
}
object BatchGetApplicationRevisionsInput {
  
  inline def apply(applicationName: ApplicationName, revisions: RevisionLocationList): BatchGetApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revisions = revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationRevisionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetApplicationRevisionsInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setRevisions(value: RevisionLocationList): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsVarargs(value: RevisionLocation*): Self = StObject.set(x, "revisions", js.Array(value*))
  }
}
