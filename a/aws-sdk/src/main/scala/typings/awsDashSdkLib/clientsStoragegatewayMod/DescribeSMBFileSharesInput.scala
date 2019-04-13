package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSMBFileSharesInput extends js.Object {
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described. 
    */
  var FileShareARNList: awsDashSdkLib.clientsStoragegatewayMod.FileShareARNList
}

object DescribeSMBFileSharesInput {
  @scala.inline
  def apply(FileShareARNList: FileShareARNList): DescribeSMBFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList)
  
    __obj.asInstanceOf[DescribeSMBFileSharesInput]
  }
}

