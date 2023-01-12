package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiptFilter extends StObject {
  
  /**
    * A structure that provides the IP addresses to block or allow, and whether to block or allow incoming mail from them.
    */
  var IpFilter: ReceiptIpFilter
  
  /**
    * The name of the IP address filter. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: ReceiptFilterName
}
object ReceiptFilter {
  
  inline def apply(IpFilter: ReceiptIpFilter, Name: ReceiptFilterName): ReceiptFilter = {
    val __obj = js.Dynamic.literal(IpFilter = IpFilter.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiptFilter] (val x: Self) extends AnyVal {
    
    inline def setIpFilter(value: ReceiptIpFilter): Self = StObject.set(x, "IpFilter", value.asInstanceOf[js.Any])
    
    inline def setName(value: ReceiptFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
