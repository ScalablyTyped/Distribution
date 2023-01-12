package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrioritizeBusinessGoals extends StObject {
  
  /**
    *  Rank of business goals based on priority. 
    */
  var businessGoals: js.UndefOr[BusinessGoals] = js.undefined
}
object PrioritizeBusinessGoals {
  
  inline def apply(): PrioritizeBusinessGoals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrioritizeBusinessGoals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrioritizeBusinessGoals] (val x: Self) extends AnyVal {
    
    inline def setBusinessGoals(value: BusinessGoals): Self = StObject.set(x, "businessGoals", value.asInstanceOf[js.Any])
    
    inline def setBusinessGoalsUndefined: Self = StObject.set(x, "businessGoals", js.undefined)
  }
}
