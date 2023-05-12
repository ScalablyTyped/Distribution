package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeRepository extends StObject {
  
  /**
    * The URL of the Git repository.
    */
  var RepositoryUrl: typings.awsSdk.clientsSagemakerMod.RepositoryUrl
}
object CodeRepository {
  
  inline def apply(RepositoryUrl: RepositoryUrl): CodeRepository = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeRepository] (val x: Self) extends AnyVal {
    
    inline def setRepositoryUrl(value: RepositoryUrl): Self = StObject.set(x, "RepositoryUrl", value.asInstanceOf[js.Any])
  }
}
