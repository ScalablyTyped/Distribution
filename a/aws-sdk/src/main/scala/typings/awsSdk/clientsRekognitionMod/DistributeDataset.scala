package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributeDataset extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that you want to use. 
    */
  var Arn: DatasetArn
}
object DistributeDataset {
  
  inline def apply(Arn: DatasetArn): DistributeDataset = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributeDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributeDataset] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DatasetArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
