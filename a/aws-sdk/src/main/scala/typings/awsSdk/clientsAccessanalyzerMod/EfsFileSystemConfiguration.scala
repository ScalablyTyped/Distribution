package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EfsFileSystemConfiguration extends StObject {
  
  /**
    * The JSON policy definition to apply to the Amazon EFS file system. For more information on the elements that make up a file system policy, see Amazon EFS Resource-based policies.
    */
  var fileSystemPolicy: js.UndefOr[EfsFileSystemPolicy] = js.undefined
}
object EfsFileSystemConfiguration {
  
  inline def apply(): EfsFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EfsFileSystemConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EfsFileSystemConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFileSystemPolicy(value: EfsFileSystemPolicy): Self = StObject.set(x, "fileSystemPolicy", value.asInstanceOf[js.Any])
    
    inline def setFileSystemPolicyUndefined: Self = StObject.set(x, "fileSystemPolicy", js.undefined)
  }
}
