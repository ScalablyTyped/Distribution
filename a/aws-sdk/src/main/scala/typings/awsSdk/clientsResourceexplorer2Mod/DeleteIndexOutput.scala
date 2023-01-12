package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIndexOutput extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the index that you successfully started the deletion process.  This operation is asynchronous. To check its status, call the GetIndex operation. 
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when you last updated this index.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates the current state of the index. 
    */
  var State: js.UndefOr[IndexState] = js.undefined
}
object DeleteIndexOutput {
  
  inline def apply(): DeleteIndexOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIndexOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIndexOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setState(value: IndexState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
