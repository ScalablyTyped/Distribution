package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is 0 hours.
    */
  var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  extension [Self <: SnapshotOptions](x: Self) {
    
    inline def setAutomatedSnapshotStartHour(value: IntegerClass): Self = StObject.set(x, "AutomatedSnapshotStartHour", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotStartHourUndefined: Self = StObject.set(x, "AutomatedSnapshotStartHour", js.undefined)
  }
}
