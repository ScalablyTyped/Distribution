package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlgorithmInput extends StObject {
  
  /**
    * The name of the algorithm to delete.
    */
  var AlgorithmName: EntityName
}
object DeleteAlgorithmInput {
  
  inline def apply(AlgorithmName: EntityName): DeleteAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlgorithmInput]
  }
  
  extension [Self <: DeleteAlgorithmInput](x: Self) {
    
    inline def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
  }
}
