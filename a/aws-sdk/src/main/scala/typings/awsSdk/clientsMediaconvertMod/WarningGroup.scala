package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningGroup extends StObject {
  
  /**
    * Warning code that identifies a specific warning in the job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
    */
  var Code: integer
  
  /**
    * The number of times this warning occurred in the job.
    */
  var Count: integer
}
object WarningGroup {
  
  inline def apply(Code: integer, Count: integer): WarningGroup = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningGroup] (val x: Self) extends AnyVal {
    
    inline def setCode(value: integer): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCount(value: integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
  }
}
