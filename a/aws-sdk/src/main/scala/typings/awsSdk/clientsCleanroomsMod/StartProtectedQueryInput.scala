package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProtectedQueryInput extends StObject {
  
  /**
    * A unique identifier for the membership to run this query against. Currently accepts a membership ID.
    */
  var membershipIdentifier: MembershipIdentifier
  
  /**
    * The details needed to write the query results.
    */
  var resultConfiguration: ProtectedQueryResultConfiguration
  
  /**
    * The protected SQL query parameters.
    */
  var sqlParameters: ProtectedQuerySQLParameters
  
  /**
    * The type of the protected query to be started.
    */
  var `type`: ProtectedQueryType
}
object StartProtectedQueryInput {
  
  inline def apply(
    membershipIdentifier: MembershipIdentifier,
    resultConfiguration: ProtectedQueryResultConfiguration,
    sqlParameters: ProtectedQuerySQLParameters,
    `type`: ProtectedQueryType
  ): StartProtectedQueryInput = {
    val __obj = js.Dynamic.literal(membershipIdentifier = membershipIdentifier.asInstanceOf[js.Any], resultConfiguration = resultConfiguration.asInstanceOf[js.Any], sqlParameters = sqlParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProtectedQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartProtectedQueryInput] (val x: Self) extends AnyVal {
    
    inline def setMembershipIdentifier(value: MembershipIdentifier): Self = StObject.set(x, "membershipIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResultConfiguration(value: ProtectedQueryResultConfiguration): Self = StObject.set(x, "resultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqlParameters(value: ProtectedQuerySQLParameters): Self = StObject.set(x, "sqlParameters", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProtectedQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
