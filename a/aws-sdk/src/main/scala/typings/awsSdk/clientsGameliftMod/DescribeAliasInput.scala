package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAliasInput extends StObject {
  
  /**
    * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN value. 
    */
  var AliasId: AliasIdOrArn
}
object DescribeAliasInput {
  
  inline def apply(AliasId: AliasIdOrArn): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAliasInput]
  }
  
  extension [Self <: DescribeAliasInput](x: Self) {
    
    inline def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
