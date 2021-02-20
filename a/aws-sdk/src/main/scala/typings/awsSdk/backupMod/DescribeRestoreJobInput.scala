package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRestoreJobInput extends StObject {
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: typings.awsSdk.backupMod.RestoreJobId = js.native
}
object DescribeRestoreJobInput {
  
  @scala.inline
  def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
  
  @scala.inline
  implicit class DescribeRestoreJobInputMutableBuilder[Self <: DescribeRestoreJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreJobId(value: RestoreJobId): Self = StObject.set(x, "RestoreJobId", value.asInstanceOf[js.Any])
  }
}
