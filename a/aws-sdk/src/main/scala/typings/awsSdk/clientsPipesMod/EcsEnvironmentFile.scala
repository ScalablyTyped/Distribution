package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsEnvironmentFile extends StObject {
  
  /**
    * The file type to use. The only supported value is s3.
    */
  var `type`: EcsEnvironmentFileType
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
    */
  var value: String
}
object EcsEnvironmentFile {
  
  inline def apply(`type`: EcsEnvironmentFileType, value: String): EcsEnvironmentFile = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsEnvironmentFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsEnvironmentFile] (val x: Self) extends AnyVal {
    
    inline def setType(value: EcsEnvironmentFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
