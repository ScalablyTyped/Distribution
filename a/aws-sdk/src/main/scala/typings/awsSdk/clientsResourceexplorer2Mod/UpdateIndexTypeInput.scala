package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIndexTypeInput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the index that you want to update.
    */
  var Arn: String
  
  /**
    * The type of the index. To understand the difference between LOCAL and AGGREGATOR, see Turning on cross-Region search in the Amazon Web Services Resource Explorer User Guide.
    */
  var Type: IndexType
}
object UpdateIndexTypeInput {
  
  inline def apply(Arn: String, Type: IndexType): UpdateIndexTypeInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIndexTypeInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setType(value: IndexType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
