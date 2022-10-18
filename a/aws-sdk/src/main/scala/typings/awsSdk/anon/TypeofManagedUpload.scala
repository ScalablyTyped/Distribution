package typings.awsSdk.anon

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload
import typings.awsSdk.libS3ManagedUploadMod.ManagedUpload.ManagedUploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofManagedUpload
  extends StObject
     with Instantiable1[/* options */ ManagedUploadOptions, ManagedUpload] {
  
  /**
    * Default value: 10000
    */
  var maxTotalParts: Double = js.native
  
  /**
    * Returns the minimum number of bytes for an individual part upload.
    * Note: Minimum allowed size is 5 MB.
    * 1024 * 5
    */
  var minPartSize: Double = js.native
}
