package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outpost extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var Arn: js.UndefOr[String] = js.undefined
}
object Outpost {
  
  inline def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  extension [Self <: Outpost](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
