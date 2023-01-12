package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HadoopJarStepConfig extends StObject {
  
  /**
    * A list of command line arguments passed to the JAR file's main function when executed.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * A path to a JAR file run during the step.
    */
  var Jar: XmlString
  
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var MainClass: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A list of Java properties that are set when the step runs. You can use these properties to pass key-value pairs to your main function.
    */
  var Properties: js.UndefOr[KeyValueList] = js.undefined
}
object HadoopJarStepConfig {
  
  inline def apply(Jar: XmlString): HadoopJarStepConfig = {
    val __obj = js.Dynamic.literal(Jar = Jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[HadoopJarStepConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HadoopJarStepConfig] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: XmlStringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    inline def setArgsVarargs(value: XmlString*): Self = StObject.set(x, "Args", js.Array(value*))
    
    inline def setJar(value: XmlString): Self = StObject.set(x, "Jar", value.asInstanceOf[js.Any])
    
    inline def setMainClass(value: XmlString): Self = StObject.set(x, "MainClass", value.asInstanceOf[js.Any])
    
    inline def setMainClassUndefined: Self = StObject.set(x, "MainClass", js.undefined)
    
    inline def setProperties(value: KeyValueList): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setPropertiesVarargs(value: KeyValue*): Self = StObject.set(x, "Properties", js.Array(value*))
  }
}
