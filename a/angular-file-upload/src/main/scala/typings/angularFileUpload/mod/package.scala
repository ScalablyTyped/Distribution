package typings.angularFileUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncFilter = js.Function3[
    /* item */ typings.std.File | typings.angularFileUpload.mod.FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ typings.angular.mod.IDeferred[js.Any], 
    scala.Unit
  ]
  
  type SyncFilter = js.Function2[
    /* item */ typings.std.File | typings.angularFileUpload.mod.FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    scala.Boolean
  ]
}
