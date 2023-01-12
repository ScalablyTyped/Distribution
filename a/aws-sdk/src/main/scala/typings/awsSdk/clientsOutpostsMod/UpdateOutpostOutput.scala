package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Outpost] = js.undefined
}
object UpdateOutpostOutput {
  
  inline def apply(): UpdateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOutpostOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOutpostOutput] (val x: Self) extends AnyVal {
    
    inline def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    inline def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
