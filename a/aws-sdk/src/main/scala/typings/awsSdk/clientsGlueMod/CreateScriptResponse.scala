package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScriptResponse extends StObject {
  
  /**
    * The Python script generated from the DAG.
    */
  var PythonScript: js.UndefOr[typings.awsSdk.clientsGlueMod.PythonScript] = js.undefined
  
  /**
    * The Scala code generated from the DAG.
    */
  var ScalaCode: js.UndefOr[typings.awsSdk.clientsGlueMod.ScalaCode] = js.undefined
}
object CreateScriptResponse {
  
  inline def apply(): CreateScriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScriptResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScriptResponse] (val x: Self) extends AnyVal {
    
    inline def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    inline def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
    
    inline def setScalaCode(value: ScalaCode): Self = StObject.set(x, "ScalaCode", value.asInstanceOf[js.Any])
    
    inline def setScalaCodeUndefined: Self = StObject.set(x, "ScalaCode", js.undefined)
  }
}
