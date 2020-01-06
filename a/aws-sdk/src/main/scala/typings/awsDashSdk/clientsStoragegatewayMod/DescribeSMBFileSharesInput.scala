package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSMBFileSharesInput extends js.Object {
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
    */
  var FileShareARNList: typings.awsDashSdk.clientsStoragegatewayMod.FileShareARNList = js.native
}

object DescribeSMBFileSharesInput {
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeSMBFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSMBFileSharesInput]
  }
}

