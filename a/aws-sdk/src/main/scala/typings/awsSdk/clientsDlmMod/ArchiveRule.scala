package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveRule extends StObject {
  
  /**
    * Information about the retention period for the snapshot archiving rule.
    */
  var RetainRule: ArchiveRetainRule
}
object ArchiveRule {
  
  inline def apply(RetainRule: ArchiveRetainRule): ArchiveRule = {
    val __obj = js.Dynamic.literal(RetainRule = RetainRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveRule]
  }
  
  extension [Self <: ArchiveRule](x: Self) {
    
    inline def setRetainRule(value: ArchiveRetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
  }
}
