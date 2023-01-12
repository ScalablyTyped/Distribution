package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchDomainConfigRequest extends StObject {
  
  /**
    * The Elasticsearch domain that you want to get information about.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object DescribeElasticsearchDomainConfigRequest {
  
  inline def apply(DomainName: DomainName): DescribeElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeElasticsearchDomainConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
