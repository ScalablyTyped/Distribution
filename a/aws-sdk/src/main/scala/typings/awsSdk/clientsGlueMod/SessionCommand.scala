package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionCommand extends StObject {
  
  /**
    * Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
    */
  var PythonVersion: js.UndefOr[PythonVersionString] = js.undefined
}
object SessionCommand {
  
  inline def apply(): SessionCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionCommand] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPythonVersion(value: PythonVersionString): Self = StObject.set(x, "PythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "PythonVersion", js.undefined)
  }
}
