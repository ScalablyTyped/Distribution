package typings.amazonDaxClient.mod

import typings.awsSdk.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmazonDaxClient extends js.Object {
  
  def createCluster(): Request[js.Object, _] = js.native
  def createCluster(
    params: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]
  ): Request[js.Object, _] = js.native
  def createCluster(params: js.Object): Request[js.Object, _] = js.native
  def createCluster(params: js.Object, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]): Request[js.Object, _] = js.native
}
