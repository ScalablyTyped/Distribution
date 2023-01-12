package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCopyJobInput extends StObject {
  
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: String
}
object DescribeCopyJobInput {
  
  inline def apply(CopyJobId: String): DescribeCopyJobInput = {
    val __obj = js.Dynamic.literal(CopyJobId = CopyJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCopyJobInput] (val x: Self) extends AnyVal {
    
    inline def setCopyJobId(value: String): Self = StObject.set(x, "CopyJobId", value.asInstanceOf[js.Any])
  }
}
