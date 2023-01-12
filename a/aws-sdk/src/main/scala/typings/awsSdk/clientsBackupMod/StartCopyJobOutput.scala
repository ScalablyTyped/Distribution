package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCopyJobOutput extends StObject {
  
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
}
object StartCopyJobOutput {
  
  inline def apply(): StartCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCopyJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartCopyJobOutput] (val x: Self) extends AnyVal {
    
    inline def setCopyJobId(value: String): Self = StObject.set(x, "CopyJobId", value.asInstanceOf[js.Any])
    
    inline def setCopyJobIdUndefined: Self = StObject.set(x, "CopyJobId", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
  }
}
