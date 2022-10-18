package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportGameConfigurationSource extends StObject {
  
  /**
    * The JSON string containing the configuration sections.
    */
  var File: RawGameConfigurationData
}
object ImportGameConfigurationSource {
  
  inline def apply(File: RawGameConfigurationData): ImportGameConfigurationSource = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportGameConfigurationSource]
  }
  
  extension [Self <: ImportGameConfigurationSource](x: Self) {
    
    inline def setFile(value: RawGameConfigurationData): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
  }
}
