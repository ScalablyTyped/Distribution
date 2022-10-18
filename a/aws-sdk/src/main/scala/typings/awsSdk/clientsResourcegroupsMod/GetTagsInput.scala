package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsInput extends StObject {
  
  /**
    * The ARN of the resource group whose tags you want to retrieve.
    */
  var Arn: GroupArn
}
object GetTagsInput {
  
  inline def apply(Arn: GroupArn): GetTagsInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsInput]
  }
  
  extension [Self <: GetTagsInput](x: Self) {
    
    inline def setArn(value: GroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
