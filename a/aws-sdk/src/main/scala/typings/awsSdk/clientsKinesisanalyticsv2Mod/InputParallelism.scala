package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParallelism extends StObject {
  
  /**
    * The number of in-application streams to create.
    */
  var Count: js.UndefOr[InputParallelismCount] = js.undefined
}
object InputParallelism {
  
  inline def apply(): InputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputParallelism] (val x: Self) extends AnyVal {
    
    inline def setCount(value: InputParallelismCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
