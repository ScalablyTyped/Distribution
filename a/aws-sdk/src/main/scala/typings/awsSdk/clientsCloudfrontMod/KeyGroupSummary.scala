package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyGroupSummary extends StObject {
  
  /**
    * A key group.
    */
  var KeyGroup: typings.awsSdk.clientsCloudfrontMod.KeyGroup
}
object KeyGroupSummary {
  
  inline def apply(KeyGroup: KeyGroup): KeyGroupSummary = {
    val __obj = js.Dynamic.literal(KeyGroup = KeyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupSummary]
  }
  
  extension [Self <: KeyGroupSummary](x: Self) {
    
    inline def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
  }
}
