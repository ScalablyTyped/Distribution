package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositorySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the linked repository.
    */
  var arn: RepositoryArn
  
  /**
    * The Amazon Resource Name (ARN) of the of your connection that connects Proton to your repository.
    */
  var connectionArn: Arn
  
  /**
    * The repository name.
    */
  var name: RepositoryName
  
  /**
    * The repository provider.
    */
  var provider: RepositoryProvider
}
object RepositorySummary {
  
  inline def apply(arn: RepositoryArn, connectionArn: Arn, name: RepositoryName, provider: RepositoryProvider): RepositorySummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], connectionArn = connectionArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositorySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositorySummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RepositoryArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArn(value: Arn): Self = StObject.set(x, "connectionArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: RepositoryProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
