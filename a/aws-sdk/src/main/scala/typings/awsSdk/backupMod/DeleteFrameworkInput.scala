package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFrameworkInput extends StObject {
  
  /**
    * The unique name of a framework.
    */
  var FrameworkName: typings.awsSdk.backupMod.FrameworkName
}
object DeleteFrameworkInput {
  
  inline def apply(FrameworkName: FrameworkName): DeleteFrameworkInput = {
    val __obj = js.Dynamic.literal(FrameworkName = FrameworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFrameworkInput]
  }
  
  extension [Self <: DeleteFrameworkInput](x: Self) {
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
  }
}
