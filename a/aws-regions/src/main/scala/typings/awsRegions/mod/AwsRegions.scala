package typings.awsRegions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRegions extends js.Object {
  
  def list(): js.Array[AwsRegionInfo] = js.native
  def list(options: ListOptions): js.Array[AwsRegionInfo] = js.native
  
  def lookup(options: LookupOptions): AwsRegionInfo = js.native
}
