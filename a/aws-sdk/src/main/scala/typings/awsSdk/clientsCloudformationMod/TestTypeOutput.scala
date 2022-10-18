package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension.
    */
  var TypeVersionArn: js.UndefOr[TypeArn] = js.undefined
}
object TestTypeOutput {
  
  inline def apply(): TestTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTypeOutput]
  }
  
  extension [Self <: TestTypeOutput](x: Self) {
    
    inline def setTypeVersionArn(value: TypeArn): Self = StObject.set(x, "TypeVersionArn", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionArnUndefined: Self = StObject.set(x, "TypeVersionArn", js.undefined)
  }
}
