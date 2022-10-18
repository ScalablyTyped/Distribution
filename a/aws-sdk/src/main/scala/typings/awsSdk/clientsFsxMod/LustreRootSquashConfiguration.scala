package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LustreRootSquashConfiguration extends StObject {
  
  /**
    * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the NID as either a single address or a range of addresses:   A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the Lustre network ID (for example, 10.0.1.6@tcp).   An address range is described using a dash to separate the range (for example, 10.0.[2-10].[1-255]@tcp).  
    */
  var NoSquashNids: js.UndefOr[LustreNoSquashNids] = js.undefined
  
  /**
    * You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format UID:GID (for example, 365534:65534). The UID and GID values can range from 0 to 4294967294:   A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each must be a non-zero value.   A value of 0 (zero) for UID and GID indicates root, and therefore disables root squash.   When root squash is enabled, the user ID and group ID of a root user accessing the file system are re-mapped to the UID and GID you provide.
    */
  var RootSquash: js.UndefOr[LustreRootSquash] = js.undefined
}
object LustreRootSquashConfiguration {
  
  inline def apply(): LustreRootSquashConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreRootSquashConfiguration]
  }
  
  extension [Self <: LustreRootSquashConfiguration](x: Self) {
    
    inline def setNoSquashNids(value: LustreNoSquashNids): Self = StObject.set(x, "NoSquashNids", value.asInstanceOf[js.Any])
    
    inline def setNoSquashNidsUndefined: Self = StObject.set(x, "NoSquashNids", js.undefined)
    
    inline def setNoSquashNidsVarargs(value: LustreNoSquashNid*): Self = StObject.set(x, "NoSquashNids", js.Array(value*))
    
    inline def setRootSquash(value: LustreRootSquash): Self = StObject.set(x, "RootSquash", value.asInstanceOf[js.Any])
    
    inline def setRootSquashUndefined: Self = StObject.set(x, "RootSquash", js.undefined)
  }
}
