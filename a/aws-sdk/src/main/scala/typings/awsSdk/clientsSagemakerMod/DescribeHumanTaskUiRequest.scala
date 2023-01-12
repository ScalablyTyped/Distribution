package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHumanTaskUiRequest extends StObject {
  
  /**
    * The name of the human task user interface (worker task template) you want information about.
    */
  var HumanTaskUiName: typings.awsSdk.clientsSagemakerMod.HumanTaskUiName
}
object DescribeHumanTaskUiRequest {
  
  inline def apply(HumanTaskUiName: HumanTaskUiName): DescribeHumanTaskUiRequest = {
    val __obj = js.Dynamic.literal(HumanTaskUiName = HumanTaskUiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanTaskUiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHumanTaskUiRequest] (val x: Self) extends AnyVal {
    
    inline def setHumanTaskUiName(value: HumanTaskUiName): Self = StObject.set(x, "HumanTaskUiName", value.asInstanceOf[js.Any])
  }
}
