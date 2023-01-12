package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLog extends StObject {
  
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[FileAccessLog] = js.undefined
}
object AccessLog {
  
  inline def apply(): AccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessLog] (val x: Self) extends AnyVal {
    
    inline def setFile(value: FileAccessLog): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
