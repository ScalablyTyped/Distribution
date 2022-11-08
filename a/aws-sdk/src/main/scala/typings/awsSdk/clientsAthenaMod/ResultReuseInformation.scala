package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultReuseInformation extends StObject {
  
  /**
    * True if a previous query result was reused; false if the result was generated from a new run of the query.
    */
  var ReusedPreviousResult: Boolean
}
object ResultReuseInformation {
  
  inline def apply(ReusedPreviousResult: Boolean): ResultReuseInformation = {
    val __obj = js.Dynamic.literal(ReusedPreviousResult = ReusedPreviousResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultReuseInformation]
  }
  
  extension [Self <: ResultReuseInformation](x: Self) {
    
    inline def setReusedPreviousResult(value: Boolean): Self = StObject.set(x, "ReusedPreviousResult", value.asInstanceOf[js.Any])
  }
}
