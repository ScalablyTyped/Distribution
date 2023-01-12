package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Details for the export revision to Amazon S3 action.
    */
  var ExportRevisionToS3: js.UndefOr[AutoExportRevisionToS3RequestDetails] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setExportRevisionToS3(value: AutoExportRevisionToS3RequestDetails): Self = StObject.set(x, "ExportRevisionToS3", value.asInstanceOf[js.Any])
    
    inline def setExportRevisionToS3Undefined: Self = StObject.set(x, "ExportRevisionToS3", js.undefined)
  }
}
