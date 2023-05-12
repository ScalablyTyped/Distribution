package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedNodesOfferingsResponse extends StObject {
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Lists available reserved node offerings.
    */
  var ReservedNodesOfferings: js.UndefOr[ReservedNodesOfferingList] = js.undefined
}
object DescribeReservedNodesOfferingsResponse {
  
  inline def apply(): DescribeReservedNodesOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedNodesOfferingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeReservedNodesOfferingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedNodesOfferings(value: ReservedNodesOfferingList): Self = StObject.set(x, "ReservedNodesOfferings", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesOfferingsUndefined: Self = StObject.set(x, "ReservedNodesOfferings", js.undefined)
    
    inline def setReservedNodesOfferingsVarargs(value: ReservedNodesOffering*): Self = StObject.set(x, "ReservedNodesOfferings", js.Array(value*))
  }
}
