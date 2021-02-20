package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCopyJobOutput extends StObject {
  
  /**
    * Contains detailed information about a copy job.
    */
  var CopyJob: js.UndefOr[typings.awsSdk.backupMod.CopyJob] = js.native
}
object DescribeCopyJobOutput {
  
  @scala.inline
  def apply(): DescribeCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyJobOutput]
  }
  
  @scala.inline
  implicit class DescribeCopyJobOutputMutableBuilder[Self <: DescribeCopyJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyJob(value: CopyJob): Self = StObject.set(x, "CopyJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyJobUndefined: Self = StObject.set(x, "CopyJob", js.undefined)
  }
}
