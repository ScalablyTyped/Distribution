package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEfsAccessPointPosixUserDetails extends StObject {
  
  /**
    * The POSIX group ID used for all file system operations using this access point. 
    */
  var Gid: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point. 
    */
  var SecondaryGids: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The POSIX user ID used for all file system operations using this access point. 
    */
  var Uid: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEfsAccessPointPosixUserDetails {
  
  inline def apply(): AwsEfsAccessPointPosixUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEfsAccessPointPosixUserDetails]
  }
  
  extension [Self <: AwsEfsAccessPointPosixUserDetails](x: Self) {
    
    inline def setGid(value: NonEmptyString): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "Gid", js.undefined)
    
    inline def setSecondaryGids(value: NonEmptyStringList): Self = StObject.set(x, "SecondaryGids", value.asInstanceOf[js.Any])
    
    inline def setSecondaryGidsUndefined: Self = StObject.set(x, "SecondaryGids", js.undefined)
    
    inline def setSecondaryGidsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecondaryGids", js.Array(value*))
    
    inline def setUid(value: NonEmptyString): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
  }
}
