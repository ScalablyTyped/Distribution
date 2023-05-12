package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQuery extends StObject {
  
  /**
    * The time at which the protected query was created.
    */
  var createTime: js.Date
  
  /**
    * An error thrown by the protected query.
    */
  var error: js.UndefOr[ProtectedQueryError] = js.undefined
  
  /**
    * The identifier for a protected query instance.
    */
  var id: UUID
  
  /**
    * The ARN of the membership.
    */
  var membershipArn: MembershipArn
  
  /**
    * The identifier for the membership.
    */
  var membershipId: UUID
  
  /**
    * The result of the protected query.
    */
  var result: js.UndefOr[ProtectedQueryResult] = js.undefined
  
  /**
    * Contains any details needed to write the query results.
    */
  var resultConfiguration: ProtectedQueryResultConfiguration
  
  /**
    * The protected query SQL parameters.
    */
  var sqlParameters: ProtectedQuerySQLParameters
  
  /**
    * Statistics about protected query execution.
    */
  var statistics: js.UndefOr[ProtectedQueryStatistics] = js.undefined
  
  /**
    * The status of the query.
    */
  var status: ProtectedQueryStatus
}
object ProtectedQuery {
  
  inline def apply(
    createTime: js.Date,
    id: UUID,
    membershipArn: MembershipArn,
    membershipId: UUID,
    resultConfiguration: ProtectedQueryResultConfiguration,
    sqlParameters: ProtectedQuerySQLParameters,
    status: ProtectedQueryStatus
  ): ProtectedQuery = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], membershipArn = membershipArn.asInstanceOf[js.Any], membershipId = membershipId.asInstanceOf[js.Any], resultConfiguration = resultConfiguration.asInstanceOf[js.Any], sqlParameters = sqlParameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQuery] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setError(value: ProtectedQueryError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembershipArn(value: MembershipArn): Self = StObject.set(x, "membershipArn", value.asInstanceOf[js.Any])
    
    inline def setMembershipId(value: UUID): Self = StObject.set(x, "membershipId", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ProtectedQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultConfiguration(value: ProtectedQueryResultConfiguration): Self = StObject.set(x, "resultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSqlParameters(value: ProtectedQuerySQLParameters): Self = StObject.set(x, "sqlParameters", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: ProtectedQueryStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatus(value: ProtectedQueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
