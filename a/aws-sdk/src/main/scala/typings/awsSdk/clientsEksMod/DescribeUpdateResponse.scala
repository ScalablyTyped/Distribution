package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUpdateResponse extends StObject {
  
  /**
    * The full description of the specified update.
    */
  var update: js.UndefOr[Update] = js.undefined
}
object DescribeUpdateResponse {
  
  inline def apply(): DescribeUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
