package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCommitRepository extends StObject {
  
  /**
    * The name of the Amazon Web Services CodeCommit repository. For more information, see repositoryName in the Amazon Web Services CodeCommit API Reference.
    */
  var Name: typings.awsSdk.clientsCodegurureviewerMod.Name
}
object CodeCommitRepository {
  
  inline def apply(Name: Name): CodeCommitRepository = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCommitRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeCommitRepository] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
