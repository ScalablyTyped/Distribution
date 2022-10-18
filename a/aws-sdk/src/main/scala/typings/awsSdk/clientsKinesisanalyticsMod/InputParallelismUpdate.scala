package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParallelismUpdate extends StObject {
  
  /**
    * Number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined
}
object InputParallelismUpdate {
  
  inline def apply(): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelismUpdate]
  }
  
  extension [Self <: InputParallelismUpdate](x: Self) {
    
    inline def setCountUpdate(value: InputParallelismCount): Self = StObject.set(x, "CountUpdate", value.asInstanceOf[js.Any])
    
    inline def setCountUpdateUndefined: Self = StObject.set(x, "CountUpdate", js.undefined)
  }
}
