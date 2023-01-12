package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIncidentRecordInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the incident record you are deleting.
    */
  var arn: Arn
}
object DeleteIncidentRecordInput {
  
  inline def apply(arn: Arn): DeleteIncidentRecordInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIncidentRecordInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIncidentRecordInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
