package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpHeaderConditionConfig extends StObject {
  
  /**
    * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The allowed characters are specified by RFC 7230. Wildcards are not supported. You can't use an HTTP header condition to specify the host header. Use HostHeaderConditionConfig to specify a host header condition.
    */
  var HttpHeaderName: js.UndefOr[HttpHeaderConditionName] = js.undefined
  
  /**
    * The strings to compare against the value of the HTTP header. The maximum size of each string is 128 characters. The comparison strings are case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request, we search them in order until a match is found. If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP header. To require that all of the strings are a match, create one condition per string.
    */
  var Values: js.UndefOr[ListOfString] = js.undefined
}
object HttpHeaderConditionConfig {
  
  inline def apply(): HttpHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeaderConditionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpHeaderConditionConfig] (val x: Self) extends AnyVal {
    
    inline def setHttpHeaderName(value: HttpHeaderConditionName): Self = StObject.set(x, "HttpHeaderName", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderNameUndefined: Self = StObject.set(x, "HttpHeaderName", js.undefined)
    
    inline def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
