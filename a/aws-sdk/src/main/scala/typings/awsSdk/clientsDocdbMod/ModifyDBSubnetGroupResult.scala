package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSubnetGroupResult extends StObject {
  
  var DBSubnetGroup: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBSubnetGroup] = js.undefined
}
object ModifyDBSubnetGroupResult {
  
  inline def apply(): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
  
  extension [Self <: ModifyDBSubnetGroupResult](x: Self) {
    
    inline def setDBSubnetGroup(value: DBSubnetGroup): Self = StObject.set(x, "DBSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupUndefined: Self = StObject.set(x, "DBSubnetGroup", js.undefined)
  }
}
