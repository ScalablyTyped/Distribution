package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPolicy extends StObject {
  
  /**
    * The default is Retain, which specifies to keep the data stored on the EFS volume. Specify Delete to delete the data stored on the EFS volume.
    */
  var HomeEfsFileSystem: js.UndefOr[RetentionType] = js.undefined
}
object RetentionPolicy {
  
  inline def apply(): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPolicy]
  }
  
  extension [Self <: RetentionPolicy](x: Self) {
    
    inline def setHomeEfsFileSystem(value: RetentionType): Self = StObject.set(x, "HomeEfsFileSystem", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemUndefined: Self = StObject.set(x, "HomeEfsFileSystem", js.undefined)
  }
}
