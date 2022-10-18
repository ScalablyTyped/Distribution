package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParallelism extends StObject {
  
  /**
    * Number of in-application streams to create. For more information, see Limits. 
    */
  var Count: js.UndefOr[InputParallelismCount] = js.undefined
}
object InputParallelism {
  
  inline def apply(): InputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelism]
  }
  
  extension [Self <: InputParallelism](x: Self) {
    
    inline def setCount(value: InputParallelismCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
