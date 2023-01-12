package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlgorithmOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new algorithm.
    */
  var AlgorithmArn: typings.awsSdk.clientsSagemakerMod.AlgorithmArn
}
object CreateAlgorithmOutput {
  
  inline def apply(AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAlgorithmOutput] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
  }
}
