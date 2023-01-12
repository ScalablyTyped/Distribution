package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonOpenSearchParameters extends StObject {
  
  /**
    * The OpenSearch domain.
    */
  var Domain: typings.awsSdk.clientsQuicksightMod.Domain
}
object AmazonOpenSearchParameters {
  
  inline def apply(Domain: Domain): AmazonOpenSearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonOpenSearchParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonOpenSearchParameters] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
