package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementResult extends StObject {
  
  /**
    * Contains metrics about the number of I/O requests that were consumed.
    */
  var ConsumedIOs: js.UndefOr[IOUsage] = js.undefined
  
  /**
    * Contains the details of the first fetched page.
    */
  var FirstPage: js.UndefOr[Page] = js.undefined
  
  /**
    * Contains server-side performance information for the command.
    */
  var TimingInformation: js.UndefOr[typings.awsSdk.clientsQldbsessionMod.TimingInformation] = js.undefined
}
object ExecuteStatementResult {
  
  inline def apply(): ExecuteStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementResult] (val x: Self) extends AnyVal {
    
    inline def setConsumedIOs(value: IOUsage): Self = StObject.set(x, "ConsumedIOs", value.asInstanceOf[js.Any])
    
    inline def setConsumedIOsUndefined: Self = StObject.set(x, "ConsumedIOs", js.undefined)
    
    inline def setFirstPage(value: Page): Self = StObject.set(x, "FirstPage", value.asInstanceOf[js.Any])
    
    inline def setFirstPageUndefined: Self = StObject.set(x, "FirstPage", js.undefined)
    
    inline def setTimingInformation(value: TimingInformation): Self = StObject.set(x, "TimingInformation", value.asInstanceOf[js.Any])
    
    inline def setTimingInformationUndefined: Self = StObject.set(x, "TimingInformation", js.undefined)
  }
}
