package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCopyJobInput extends StObject {
  
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: String = js.native
}
object DescribeCopyJobInput {
  
  @scala.inline
  def apply(CopyJobId: String): DescribeCopyJobInput = {
    val __obj = js.Dynamic.literal(CopyJobId = CopyJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobInput]
  }
  
  @scala.inline
  implicit class DescribeCopyJobInputMutableBuilder[Self <: DescribeCopyJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyJobId(value: String): Self = StObject.set(x, "CopyJobId", value.asInstanceOf[js.Any])
  }
}
