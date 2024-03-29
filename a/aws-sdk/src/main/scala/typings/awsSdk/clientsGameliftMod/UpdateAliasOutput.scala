package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasOutput extends StObject {
  
  /**
    * The updated alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.clientsGameliftMod.Alias] = js.undefined
}
object UpdateAliasOutput {
  
  inline def apply(): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAliasOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAliasOutput] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
