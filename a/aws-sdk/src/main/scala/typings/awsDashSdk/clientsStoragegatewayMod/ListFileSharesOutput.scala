package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFileSharesOutput extends js.Object {
  /**
    * An array of information about the file gateway's file shares. 
    */
  var FileShareInfoList: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareInfoList] = js.undefined
  /**
    * If the request includes Marker, the response returns that value in this field. 
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
  /**
    * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares. 
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object ListFileSharesOutput {
  @scala.inline
  def apply(FileShareInfoList: FileShareInfoList = null, Marker: Marker = null, NextMarker: Marker = null): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareInfoList != null) __obj.updateDynamic("FileShareInfoList")(FileShareInfoList)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListFileSharesOutput]
  }
}

