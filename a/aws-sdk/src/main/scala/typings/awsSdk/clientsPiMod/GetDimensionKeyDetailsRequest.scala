package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDimensionKeyDetailsRequest extends StObject {
  
  /**
    * The name of the dimension group. Performance Insights searches the specified group for the dimension group ID. The following group name values are valid:    db.query (Amazon DocumentDB only)    db.sql (Amazon RDS and Aurora only)  
    */
  var Group: RequestString
  
  /**
    * The ID of the dimension group from which to retrieve dimension details. For dimension group db.sql, the group ID is db.sql.id. The following group ID values are valid:    db.sql.id for dimension group db.sql (Aurora and RDS only)    db.query.id for dimension group db.query (DocumentDB only)  
    */
  var GroupIdentifier: RequestString
  
  /**
    * The ID for a data source from which to gather dimension data. This ID must be immutable and unique within an Amazon Web Services Region. When a DB instance is the data source, specify its DbiResourceId value. For example, specify db-ABCDEFGHIJKLMNOPQRSTU1VW2X. 
    */
  var Identifier: IdentifierString
  
  /**
    * A list of dimensions to retrieve the detail data for within the given dimension group. If you don't specify this parameter, Performance Insights returns all dimension data within the specified dimension group. Specify dimension names for the following dimension groups:    db.sql - Specify either the full dimension name db.sql.statement or the short dimension name statement (Aurora and RDS only).    db.query - Specify either the full dimension name db.query.statement or the short dimension name statement (DocumentDB only).  
    */
  var RequestedDimensions: js.UndefOr[RequestedDimensionList] = js.undefined
  
  /**
    * The Amazon Web Services service for which Performance Insights returns data. The only valid value is RDS.
    */
  var ServiceType: typings.awsSdk.clientsPiMod.ServiceType
}
object GetDimensionKeyDetailsRequest {
  
  inline def apply(
    Group: RequestString,
    GroupIdentifier: RequestString,
    Identifier: IdentifierString,
    ServiceType: ServiceType
  ): GetDimensionKeyDetailsRequest = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDimensionKeyDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDimensionKeyDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: RequestString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifier(value: RequestString): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: IdentifierString): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRequestedDimensions(value: RequestedDimensionList): Self = StObject.set(x, "RequestedDimensions", value.asInstanceOf[js.Any])
    
    inline def setRequestedDimensionsUndefined: Self = StObject.set(x, "RequestedDimensions", js.undefined)
    
    inline def setRequestedDimensionsVarargs(value: RequestString*): Self = StObject.set(x, "RequestedDimensions", js.Array(value*))
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
  }
}
