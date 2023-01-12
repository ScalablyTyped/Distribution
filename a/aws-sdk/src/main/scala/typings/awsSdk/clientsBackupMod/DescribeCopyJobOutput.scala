package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCopyJobOutput extends StObject {
  
  /**
    * Contains detailed information about a copy job.
    */
  var CopyJob: js.UndefOr[typings.awsSdk.clientsBackupMod.CopyJob] = js.undefined
}
object DescribeCopyJobOutput {
  
  inline def apply(): DescribeCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCopyJobOutput] (val x: Self) extends AnyVal {
    
    inline def setCopyJob(value: CopyJob): Self = StObject.set(x, "CopyJob", value.asInstanceOf[js.Any])
    
    inline def setCopyJobUndefined: Self = StObject.set(x, "CopyJob", js.undefined)
  }
}
