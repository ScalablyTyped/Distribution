package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIncidentRecordInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident record.
    */
  var arn: Arn
}
object GetIncidentRecordInput {
  
  inline def apply(arn: Arn): GetIncidentRecordInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIncidentRecordInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIncidentRecordInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
