package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexInput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the index that you want to delete.
    */
  var Arn: String
}
object DeleteIndexInput {
  
  inline def apply(Arn: String): DeleteIndexInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexInput]
  }
  
  extension [Self <: DeleteIndexInput](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
