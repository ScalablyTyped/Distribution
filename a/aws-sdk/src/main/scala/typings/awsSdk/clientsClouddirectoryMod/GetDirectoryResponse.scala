package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDirectoryResponse extends StObject {
  
  /**
    * Metadata about the directory.
    */
  var Directory: typings.awsSdk.clientsClouddirectoryMod.Directory
}
object GetDirectoryResponse {
  
  inline def apply(Directory: Directory): GetDirectoryResponse = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResponse]
  }
  
  extension [Self <: GetDirectoryResponse](x: Self) {
    
    inline def setDirectory(value: Directory): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
  }
}
