package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Outpost] = js.undefined
}
object CreateOutpostOutput {
  
  inline def apply(): CreateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutpostOutput]
  }
  
  extension [Self <: CreateOutpostOutput](x: Self) {
    
    inline def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    inline def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
