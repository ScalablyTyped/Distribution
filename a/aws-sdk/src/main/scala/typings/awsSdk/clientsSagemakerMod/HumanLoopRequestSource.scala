package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopRequestSource extends StObject {
  
  /**
    * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field settings and JSON parsing rules are different based on the integration source. Valid values:
    */
  var AwsManagedHumanLoopRequestSource: typings.awsSdk.clientsSagemakerMod.AwsManagedHumanLoopRequestSource
}
object HumanLoopRequestSource {
  
  inline def apply(AwsManagedHumanLoopRequestSource: AwsManagedHumanLoopRequestSource): HumanLoopRequestSource = {
    val __obj = js.Dynamic.literal(AwsManagedHumanLoopRequestSource = AwsManagedHumanLoopRequestSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopRequestSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HumanLoopRequestSource] (val x: Self) extends AnyVal {
    
    inline def setAwsManagedHumanLoopRequestSource(value: AwsManagedHumanLoopRequestSource): Self = StObject.set(x, "AwsManagedHumanLoopRequestSource", value.asInstanceOf[js.Any])
  }
}
