package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentFile extends StObject {
  
  /**
    * The file type to use. The only supported value is s3.
    */
  var `type`: EnvironmentFileType
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
    */
  var value: String
}
object EnvironmentFile {
  
  inline def apply(`type`: EnvironmentFileType, value: String): EnvironmentFile = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentFile]
  }
  
  extension [Self <: EnvironmentFile](x: Self) {
    
    inline def setType(value: EnvironmentFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
