package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNFSFileSharesInput extends js.Object {
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
    */
  var FileShareARNList: typings.awsDashSdk.clientsStoragegatewayMod.FileShareARNList
}

object DescribeNFSFileSharesInput {
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeNFSFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList)
  
    __obj.asInstanceOf[DescribeNFSFileSharesInput]
  }
}

