package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replica extends StObject {
  
  /**
    * The Region where the replica needs to be created.
    */
  var RegionName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.RegionName] = js.undefined
}
object Replica {
  
  inline def apply(): Replica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replica]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Replica] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
