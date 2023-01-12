package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleKafkaVersion extends StObject {
  
  /**
    * 
    An Apache Kafka version.
    
    */
  var SourceVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    A list of Apache Kafka versions.
    
    */
  var TargetVersions: js.UndefOr[listOfString] = js.undefined
}
object CompatibleKafkaVersion {
  
  inline def apply(): CompatibleKafkaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleKafkaVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatibleKafkaVersion] (val x: Self) extends AnyVal {
    
    inline def setSourceVersion(value: string): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setTargetVersions(value: listOfString): Self = StObject.set(x, "TargetVersions", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionsUndefined: Self = StObject.set(x, "TargetVersions", js.undefined)
    
    inline def setTargetVersionsVarargs(value: string*): Self = StObject.set(x, "TargetVersions", js.Array(value*))
  }
}
