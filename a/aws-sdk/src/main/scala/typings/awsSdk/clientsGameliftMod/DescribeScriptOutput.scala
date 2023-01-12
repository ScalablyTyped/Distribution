package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScriptOutput extends StObject {
  
  /**
    * A set of properties describing the requested script.
    */
  var Script: js.UndefOr[typings.awsSdk.clientsGameliftMod.Script] = js.undefined
}
object DescribeScriptOutput {
  
  inline def apply(): DescribeScriptOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScriptOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeScriptOutput] (val x: Self) extends AnyVal {
    
    inline def setScript(value: Script): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "Script", js.undefined)
  }
}
