package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  /**
    * The time, in UTC format, when OpenSearch Service takes a daily automated snapshot of the specified domain. Default is 0 hours.
    */
  var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomatedSnapshotStartHour(value: IntegerClass): Self = StObject.set(x, "AutomatedSnapshotStartHour", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotStartHourUndefined: Self = StObject.set(x, "AutomatedSnapshotStartHour", js.undefined)
  }
}
