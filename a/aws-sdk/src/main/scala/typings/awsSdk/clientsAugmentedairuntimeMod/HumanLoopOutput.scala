package typings.awsSdk.clientsAugmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopOutput extends StObject {
  
  /**
    * The location of the Amazon S3 object where Amazon Augmented AI stores your human loop output.
    */
  var OutputS3Uri: String
}
object HumanLoopOutput {
  
  inline def apply(OutputS3Uri: String): HumanLoopOutput = {
    val __obj = js.Dynamic.literal(OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HumanLoopOutput] (val x: Self) extends AnyVal {
    
    inline def setOutputS3Uri(value: String): Self = StObject.set(x, "OutputS3Uri", value.asInstanceOf[js.Any])
  }
}
