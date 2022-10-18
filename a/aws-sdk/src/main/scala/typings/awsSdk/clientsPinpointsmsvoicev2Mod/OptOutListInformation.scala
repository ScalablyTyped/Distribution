package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptOutListInformation extends StObject {
  
  /**
    * The time when the OutOutList was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the OptOutList.
    */
  var OptOutListArn: String
  
  /**
    * The name of the OptOutList.
    */
  var OptOutListName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName
}
object OptOutListInformation {
  
  inline def apply(CreatedTimestamp: js.Date, OptOutListArn: String, OptOutListName: OptOutListName): OptOutListInformation = {
    val __obj = js.Dynamic.literal(CreatedTimestamp = CreatedTimestamp.asInstanceOf[js.Any], OptOutListArn = OptOutListArn.asInstanceOf[js.Any], OptOutListName = OptOutListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptOutListInformation]
  }
  
  extension [Self <: OptOutListInformation](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOptOutListArn(value: String): Self = StObject.set(x, "OptOutListArn", value.asInstanceOf[js.Any])
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
  }
}
