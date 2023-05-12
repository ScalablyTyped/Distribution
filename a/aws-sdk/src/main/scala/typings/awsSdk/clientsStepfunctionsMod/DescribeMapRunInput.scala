package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMapRunInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies a Map Run.
    */
  var mapRunArn: LongArn
}
object DescribeMapRunInput {
  
  inline def apply(mapRunArn: LongArn): DescribeMapRunInput = {
    val __obj = js.Dynamic.literal(mapRunArn = mapRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMapRunInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMapRunInput] (val x: Self) extends AnyVal {
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
  }
}
