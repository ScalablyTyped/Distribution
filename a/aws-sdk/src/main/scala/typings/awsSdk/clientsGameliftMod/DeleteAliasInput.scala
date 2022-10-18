package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAliasInput extends StObject {
  
  /**
    * A unique identifier of the alias that you want to delete. You can use either the alias ID or ARN value.
    */
  var AliasId: AliasIdOrArn
}
object DeleteAliasInput {
  
  inline def apply(AliasId: AliasIdOrArn): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasInput]
  }
  
  extension [Self <: DeleteAliasInput](x: Self) {
    
    inline def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
