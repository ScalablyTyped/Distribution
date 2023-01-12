package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOptOutListResult extends StObject {
  
  /**
    * The time when the OptOutList was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the OptOutList that was removed.
    */
  var OptOutListArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the OptOutList that was removed.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName] = js.undefined
}
object DeleteOptOutListResult {
  
  inline def apply(): DeleteOptOutListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOptOutListResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOptOutListResult] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setOptOutListArn(value: String): Self = StObject.set(x, "OptOutListArn", value.asInstanceOf[js.Any])
    
    inline def setOptOutListArnUndefined: Self = StObject.set(x, "OptOutListArn", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
  }
}
