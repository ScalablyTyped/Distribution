package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSubnetGroupResult extends StObject {
  
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBSubnetGroup] = js.undefined
}
object CreateDBSubnetGroupResult {
  
  inline def apply(): CreateDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSubnetGroupResult]
  }
  
  extension [Self <: CreateDBSubnetGroupResult](x: Self) {
    
    inline def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
  }
}
