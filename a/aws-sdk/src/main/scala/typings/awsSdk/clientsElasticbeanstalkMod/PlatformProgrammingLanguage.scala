package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformProgrammingLanguage extends StObject {
  
  /**
    * The name of the programming language.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the programming language.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object PlatformProgrammingLanguage {
  
  inline def apply(): PlatformProgrammingLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformProgrammingLanguage]
  }
  
  extension [Self <: PlatformProgrammingLanguage](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
