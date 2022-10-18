package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrCollectionChange extends StObject {
  
  /**
    * CIDR collection change action. 
    */
  var Action: CidrCollectionChangeAction
  
  /**
    * List of CIDR blocks.
    */
  var CidrList: typings.awsSdk.clientsRoute53Mod.CidrList
  
  /**
    * Name of the location that is associated with the CIDR collection.
    */
  var LocationName: CidrLocationNameDefaultNotAllowed
}
object CidrCollectionChange {
  
  inline def apply(
    Action: CidrCollectionChangeAction,
    CidrList: CidrList,
    LocationName: CidrLocationNameDefaultNotAllowed
  ): CidrCollectionChange = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], CidrList = CidrList.asInstanceOf[js.Any], LocationName = LocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidrCollectionChange]
  }
  
  extension [Self <: CidrCollectionChange](x: Self) {
    
    inline def setAction(value: CidrCollectionChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setCidrList(value: CidrList): Self = StObject.set(x, "CidrList", value.asInstanceOf[js.Any])
    
    inline def setCidrListVarargs(value: Cidr*): Self = StObject.set(x, "CidrList", js.Array(value*))
    
    inline def setLocationName(value: CidrLocationNameDefaultNotAllowed): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
  }
}
