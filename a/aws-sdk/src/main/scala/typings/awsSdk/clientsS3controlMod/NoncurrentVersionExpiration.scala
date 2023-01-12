package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncurrentVersionExpiration extends StObject {
  
  /**
    * Specifies how many noncurrent versions S3 on Outposts will retain. If there are this many more recent noncurrent versions, S3 on Outposts will take the associated action. For more information about noncurrent versions, see Lifecycle configuration elements in the Amazon S3 User Guide.
    */
  var NewerNoncurrentVersions: js.UndefOr[NoncurrentVersionCount] = js.undefined
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon S3 User Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
}
object NoncurrentVersionExpiration {
  
  inline def apply(): NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoncurrentVersionExpiration] (val x: Self) extends AnyVal {
    
    inline def setNewerNoncurrentVersions(value: NoncurrentVersionCount): Self = StObject.set(x, "NewerNoncurrentVersions", value.asInstanceOf[js.Any])
    
    inline def setNewerNoncurrentVersionsUndefined: Self = StObject.set(x, "NewerNoncurrentVersions", js.undefined)
    
    inline def setNoncurrentDays(value: Days): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
  }
}
