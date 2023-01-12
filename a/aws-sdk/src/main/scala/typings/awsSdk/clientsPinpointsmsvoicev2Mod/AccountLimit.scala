package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimit extends StObject {
  
  /**
    * The Amazon Web Services set limit for that resource type, in US dollars.
    */
  var Max: PrimitiveLong
  
  /**
    * The name of the attribute to apply the account limit to.
    */
  var Name: AccountLimitName
  
  /**
    * The current amount that has been spent, in US dollars.
    */
  var Used: PrimitiveLong
}
object AccountLimit {
  
  inline def apply(Max: PrimitiveLong, Name: AccountLimitName, Used: PrimitiveLong): AccountLimit = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Used = Used.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountLimit] (val x: Self) extends AnyVal {
    
    inline def setMax(value: PrimitiveLong): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccountLimitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: PrimitiveLong): Self = StObject.set(x, "Used", value.asInstanceOf[js.Any])
  }
}
