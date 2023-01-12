package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventDetailsForOrganizationRequest extends StObject {
  
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.clientsHealthMod.locale] = js.undefined
  
  /**
    * A set of JSON elements that includes the awsAccountId and the eventArn.
    */
  var organizationEventDetailFilters: OrganizationEventDetailFiltersList
}
object DescribeEventDetailsForOrganizationRequest {
  
  inline def apply(organizationEventDetailFilters: OrganizationEventDetailFiltersList): DescribeEventDetailsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEventDetailFilters = organizationEventDetailFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventDetailsForOrganizationRequest] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOrganizationEventDetailFilters(value: OrganizationEventDetailFiltersList): Self = StObject.set(x, "organizationEventDetailFilters", value.asInstanceOf[js.Any])
    
    inline def setOrganizationEventDetailFiltersVarargs(value: EventAccountFilter*): Self = StObject.set(x, "organizationEventDetailFilters", js.Array(value*))
  }
}
