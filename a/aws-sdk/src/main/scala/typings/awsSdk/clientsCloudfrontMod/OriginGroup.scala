package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginGroup extends StObject {
  
  /**
    * A complex type that contains information about the failover criteria for an origin group.
    */
  var FailoverCriteria: OriginGroupFailoverCriteria
  
  /**
    * The origin group's ID.
    */
  var Id: String
  
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers
}
object OriginGroup {
  
  inline def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroup]
  }
  
  extension [Self <: OriginGroup](x: Self) {
    
    inline def setFailoverCriteria(value: OriginGroupFailoverCriteria): Self = StObject.set(x, "FailoverCriteria", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: OriginGroupMembers): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
  }
}
