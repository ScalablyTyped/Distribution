package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonElasticsearchParameters extends StObject {
  
  /**
    * The OpenSearch domain.
    */
  var Domain: typings.awsSdk.clientsQuicksightMod.Domain
}
object AmazonElasticsearchParameters {
  
  inline def apply(Domain: Domain): AmazonElasticsearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonElasticsearchParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonElasticsearchParameters] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
