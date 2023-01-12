package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFrameworkInput extends StObject {
  
  /**
    * The unique name of a framework.
    */
  var FrameworkName: typings.awsSdk.clientsBackupMod.FrameworkName
}
object DeleteFrameworkInput {
  
  inline def apply(FrameworkName: FrameworkName): DeleteFrameworkInput = {
    val __obj = js.Dynamic.literal(FrameworkName = FrameworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFrameworkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFrameworkInput] (val x: Self) extends AnyVal {
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
  }
}
