package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourcePriority extends StObject {
  
  /**
    * The name of the source you choose as the primary source for this flow.
    */
  var PrimarySource: js.UndefOr[string] = js.undefined
}
object SourcePriority {
  
  inline def apply(): SourcePriority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourcePriority]
  }
  
  extension [Self <: SourcePriority](x: Self) {
    
    inline def setPrimarySource(value: string): Self = StObject.set(x, "PrimarySource", value.asInstanceOf[js.Any])
    
    inline def setPrimarySourceUndefined: Self = StObject.set(x, "PrimarySource", js.undefined)
  }
}
