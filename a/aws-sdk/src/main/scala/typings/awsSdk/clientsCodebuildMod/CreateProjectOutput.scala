package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectOutput extends StObject {
  
  /**
    * Information about the build project that was created.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object CreateProjectOutput {
  
  inline def apply(): CreateProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectOutput]
  }
  
  extension [Self <: CreateProjectOutput](x: Self) {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
