package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBasedCollectionScheme extends StObject {
  
  /**
    * The time period (in milliseconds) to decide how often to collect data. For example, if the time period is 60000, the Edge Agent software collects data once every minute.
    */
  var periodMs: collectionPeriodMs
}
object TimeBasedCollectionScheme {
  
  inline def apply(periodMs: collectionPeriodMs): TimeBasedCollectionScheme = {
    val __obj = js.Dynamic.literal(periodMs = periodMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedCollectionScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeBasedCollectionScheme] (val x: Self) extends AnyVal {
    
    inline def setPeriodMs(value: collectionPeriodMs): Self = StObject.set(x, "periodMs", value.asInstanceOf[js.Any])
  }
}
