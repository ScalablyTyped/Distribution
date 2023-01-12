package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotMigration extends StObject {
  
  /**
    * The percentage of the slot migration that is complete.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.undefined
}
object SlotMigration {
  
  inline def apply(): SlotMigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotMigration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotMigration] (val x: Self) extends AnyVal {
    
    inline def setProgressPercentage(value: Double): Self = StObject.set(x, "ProgressPercentage", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentageUndefined: Self = StObject.set(x, "ProgressPercentage", js.undefined)
  }
}
