package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosixUser extends StObject {
  
  /**
    * The POSIX group ID used for all file system operations using this access point.
    */
  var Gid: typings.awsSdk.clientsEfsMod.Gid
  
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point.
    */
  var SecondaryGids: js.UndefOr[typings.awsSdk.clientsEfsMod.SecondaryGids] = js.undefined
  
  /**
    * The POSIX user ID used for all file system operations using this access point.
    */
  var Uid: typings.awsSdk.clientsEfsMod.Uid
}
object PosixUser {
  
  inline def apply(Gid: Gid, Uid: Uid): PosixUser = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixUser]
  }
  
  extension [Self <: PosixUser](x: Self) {
    
    inline def setGid(value: Gid): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setSecondaryGids(value: SecondaryGids): Self = StObject.set(x, "SecondaryGids", value.asInstanceOf[js.Any])
    
    inline def setSecondaryGidsUndefined: Self = StObject.set(x, "SecondaryGids", js.undefined)
    
    inline def setSecondaryGidsVarargs(value: Gid*): Self = StObject.set(x, "SecondaryGids", js.Array(value*))
    
    inline def setUid(value: Uid): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
  }
}
