package typings
package apolloDashCacheLib.libTypesDataProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProxy extends js.Object {
  def readFragment[FragmentType, TVariables](options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Fragment[TVariables]): FragmentType | scala.Null = js.native
  def readFragment[FragmentType, TVariables](
    options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Fragment[TVariables],
    optimistic: scala.Boolean
  ): FragmentType | scala.Null = js.native
  def readQuery[QueryType, TVariables](options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables]): QueryType | scala.Null = js.native
  def readQuery[QueryType, TVariables](
    options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables],
    optimistic: scala.Boolean
  ): QueryType | scala.Null = js.native
  def writeData[TData](options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.WriteDataOptions[TData]): scala.Unit = js.native
  def writeFragment[TData, TVariables](
    options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.WriteFragmentOptions[TData, TVariables]
  ): scala.Unit = js.native
  def writeQuery[TData, TVariables](options: apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.WriteQueryOptions[TData, TVariables]): scala.Unit = js.native
}

