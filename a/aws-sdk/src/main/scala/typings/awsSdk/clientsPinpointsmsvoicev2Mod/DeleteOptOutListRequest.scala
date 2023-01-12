package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOptOutListRequest extends StObject {
  
  /**
    * The OptOutListName or OptOutListArn of the OptOutList to delete. You can use DescribeOptOutLists to find the values for OptOutListName and OptOutListArn.
    */
  var OptOutListName: OptOutListNameOrArn
}
object DeleteOptOutListRequest {
  
  inline def apply(OptOutListName: OptOutListNameOrArn): DeleteOptOutListRequest = {
    val __obj = js.Dynamic.literal(OptOutListName = OptOutListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptOutListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOptOutListRequest] (val x: Self) extends AnyVal {
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
  }
}
